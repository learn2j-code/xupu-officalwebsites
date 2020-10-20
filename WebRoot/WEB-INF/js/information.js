$(function(){
	
	var currentDate = getNowFormatDate();
	$(".js-current-date").text(currentDate);
	if(currentDate){
		var cc = new CalendarConverter;
		var currentDateSplit = currentDate.split('-');
		var result = cc.solar2lunar(new Date(parseInt(currentDateSplit[0]), parseInt(currentDateSplit[1]), parseInt(currentDateSplit[2])));
		$(".js-current-old-date").text(result.cYear+result.cMonth+result.lunarDay);
	}
	
	var swiper = new Swiper('.swiper-container', {
	      pagination: {
	        el: '.swiper-pagination',
	      },
	      autoplay: {
	      	stopOnLastSlide: true,
	      },
	      loop: true
	    });
	
	var params = {};
	var moduleId = GetQueryString('id')||'1';
	var moduleType = GetQueryString('moduleType')||'1';
	
	if(moduleType == 1){
		$(".js-surname-infor > li").eq(0).addClass('active');
		$(".js-surname-infor > li").eq(1).removeClass('active');
		
		$(".js-infor-wrap以 > div").eq(0).css('display','block');
		$(".js-infor-wrap > div").eq(1).css('display','none');
		loadInformationData(2);
		$(".js-breadcrumb").text('姓氏资讯');
	}else{
		$(".js-surname-infor > li").eq(1).addClass('active');
		$(".js-surname-infor > li").eq(0).removeClass('active');
		
		$(".js-infor-wrap > div").eq(1).css('display','block');
		$(".js-infor-wrap > div").eq(0).css('display','none');
		loadInformationData(3);
		$(".js-breadcrumb").text('寻祖资讯');
	}
	
	$('body').on('click','.js-surname-infor > li',function(){
		var moduleId = $(this).attr('data-id');
		$(this).addClass('active').siblings().removeClass('active');
		loadInformationData(moduleId);
		if($(".js-breadcrumb").text() == '姓氏资讯'){
			$(".js-breadcrumb").text('寻祖资讯');
		}else{
			$(".js-breadcrumb").text('姓氏资讯');
		}
		
	})
	
	loadFriendLink();
	
	function loadInformationData(moduleId){
		params.moduleId = moduleId;
		params.page = {};
		params.page.start = 1;
		params.page.count = 10;
		family_loading();
		$.ajax({
			url:URL+'findArticalPageByModuleId',
			data:JSON.stringify(params),
			type: "POST",
			contentType: "application/json;charset=utf-8"
		}).done(function(json){
			if(json){
				var str = '';
				var data = json.entryList;
				if(data.length > 0){
					for(var i = 0;i<data.length;i++){
						str+='<li class="js-articl-item" data-id="'+data[i].id+'" title="'+data[i].title+'"><a href="javascript:void(0);">'+data[i].title+'</a><span>2018-3-21</span></li>'
					}
					$(".js-surname-list").html(str);
					
					var pageTotal = json.page.totalPage;
					var currentPage = json.page.start;
					var pageCount = json.page.count;

					var options = {
		                            bootstrapMajorVersion: 3, //版本
		                            currentPage: currentPage, //当前页数
		                            totalPages: pageTotal, //总页数
		                            numberOfPages: pageCount,
		                            itemTexts: function (type, page, current) {
		                                switch (type) {
		                                    case "prev":
		                                        return '<a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a>';
		                                    case "first":
		                                        return "首页";
		                                    case "last":
		                                        return "尾页";
		                                    case "next":
		                                        return '<a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a>';
		                                    case "page":
		                                        return page;
		                                }
		                            },//点击事件，用于通过Ajax来刷新整个list列表
		                            onPageClicked: function (event, originalEvent, type, page) {
		                            	var p = {};

		                            	p.moduleId = moduleId;
		                        		p.page = {};
		                        		p.page.start = page;
		                        		p.page.count = 10;

		                                $.ajax({
		                                     url: URL+'findArticalPageByModuleId',
		                                     type: 'POST',
		                                     data: JSON.stringify(p),
		                                     contentType: "application/json;charset=utf-8",
		                                     success: function(json2){
		                                    	 if(json2.entryList.length > 0){
		                                    		var data = json2.entryList;
		                             				var str = '';
		                             				for(var i = 0;i<data.length;i++){
		                             					var dateStr = data[i].releaseDate.substring(0,9);
		                             					str+='<li class="js-articl-item" data-id="'+data[i].id+'" title="'+data[i].title+'"><a href="javascript:void(0);">'+data[i].title+'</a><span>'+dateStr+'</span></li>'
		                             				}
		                             				$(".js-surname-list").html(str);
		                                    	 }
		                                    }
		                                });
		                            }
		                        };
		                        $('#pagination').bootstrapPaginator(options);
				}
			}
		}).always(function(){
			family_loading();
		});
	}
	
	
	$("body").on('click','.js-articl-item',function(){
		var id = $(this).attr('data-id');
		
		window.location.href="news/articleDetail?id="+id;
	})
	
	function loadFriendLink(){
		var params = {};
		params.websiteId = '1';
		$.ajax({
			url:URL+'findSLinkurlListByWebsiteId',
			data:JSON.stringify(params),
			type: "POST",
			contentType: "application/json;charset=utf-8"
		}).done(function(json){
			if(json){
				var str = '';
				for(var i = 0;i<json.length;i++){
					if(json[i].delFlg != '1'){
						str+='<li><a href="http://'+json[i].weburl+'">'+json[i].stationName+'</a></li>';
					}
				}
				$(".js-friend-link").html(str);
			}
		});
	}
})