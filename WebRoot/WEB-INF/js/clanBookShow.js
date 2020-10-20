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
	
	loadSurnamesList();
	loadSurnameInformation();
	loadXuZuInformation();
	loadFriendLink();
	
	$(document).on('click','.xupu-clan-book-list',function(){
		var id = $(this).attr('data-id');
		$("#userName").val('');
		$("#passWord").val('');
		$("#loginClanBook").modal('show');
		$("#clanBookId").val(id);
	});
	$("#loginBtn").click(function(){
		var userName = $("#userName").val();
		var passWord = $("#passWord").val();
		var id = $("#clanBookId").val();
		
		if(id == '3'){
			if(userName != 'OuYang0628'){
				showMsg('用户名不正确');
				return false;
			}else if(passWord != 'ouyangxupu888'){
				showMsg('密码不正确');
				return false;
			}
			$("#loginClanBook").modal('hide');
			window.open('http://window.100tp.cn:8780/clanFullScreen.html?parentId=3');
		}else if(id == '7'){
			if(userName != 'Liu0628'){
				showMsg('用户名不正确');
				return false;
			}else if(passWord != 'liuxupu888'){
				showMsg('密码不正确');
				return false;
			}
			$("#loginClanBook").modal('hide');
			window.open('http://window.100tp.cn:8780/clanFullScreen.html?parentId=7');
		}
	});
	function loadSurnamesList(){
		var params = {};
		params.moduleName = '百家姓';
		family_loading();
		$.ajax({
			url:URL+'findBJXArticalListByModuleName',
			data:JSON.stringify(params),
			type: "POST",
			contentType: "application/json;charset=utf-8"
		}).done(function(json){
			if(json){
				var str = '';
				for(var key in json){
					var letter = key.toUpperCase();
					str+='<div class="bb-1 pv15">'+
					 '<span class="xupu-surnames-letter pull-left">'+letter+'</span>'+
					 '<div class="flex xupu-surnames-wrap">';
					for(var j = 0;j<json[key].length;j++){
						str+='<div class="clearflex"><a href="baijiaxing/articleDetail?id='+json[key][j].id+'">'+json[key][j].title+'</a></div>';
					}
					str+='</div></div>';
				}
				$(".js-surnames-wrap").html(str);
			}
		}).always(function(){
			family_loading();
		});
	}
	function loadFriendLink(){
		var params = {};
		params.websiteId = '1';
		family_loading();
		$.ajax({
			url:URL+'findSLinkurlListByWebsiteId',
			data:JSON.stringify(params),
			type: "POST",
			contentType: "application/json;charset=utf-8"
		}).done(function(json){
			if(json){
				var str = '';
				for(var i = 0;i<json.length;i++){
					str+='<li><a href="'+json[i].weburl+'">'+json[i].stationName+'</a></li>';
				}
				$(".js-friend-link").html(str);
			}
		}).always(function(){
			family_loading();
		});
	}
	function loadSurnameInformation(){
		var params = {};
		var moduleId = 2;
		params.moduleId = moduleId;
		params.page = {};
		params.page.start = 1;
		params.page.count = 6;

		$.ajax({
			url:URL+'findArticalPageByModuleId',
			data:JSON.stringify(params),
			type: "POST",
			contentType: "application/json;charset=utf-8"
		}).done(function(json){
			if(json){
				json = json.entryList;
				var str = '';
				for(var i = 0;i<json.length;i++){
					if(json[i].delFlg != '1'){
						str+='<li><a href="http://'+json[i].weburl+'">'+json[i].stationName+'</a></li>';
					}
				}
				$(".js-surname-infor-list").html(str);
			}
		});
	}
	
	function loadXuZuInformation(){
		var params = {};
		var moduleId = 3;
		params.moduleId = moduleId;
		params.page = {};
		params.page.start = 1;
		params.page.count = 6;

		$.ajax({
			url:URL+'findArticalPageByModuleId',
			data:JSON.stringify(params),
			type: "POST",
			contentType: "application/json;charset=utf-8"
		}).done(function(json){
			if(json){
				var str = '';
				json = json.entryList;
				for(var i = 0;i<json.length;i++){
					str+='<li title="'+json[i].title+'"><a href="news/articleDetail?id='+json[i].id+'">'+json[i].title+'</a></li>';
				}
				$(".js-xuzu-infor-list").html(str);
			}
		});
	}
	
	function loadFriendLink(){
		var params = {};
		params.websiteId = '1';
		family_loading();
		$.ajax({
			url:URL+'findSLinkurlListByWebsiteId',
			data:JSON.stringify(params),
			type: "POST",
			contentType: "application/json;charset=utf-8"
		}).done(function(json){
			if(json){
				var str = '';
				for(var i = 0;i<json.length;i++){
					str+='<li><a href="http://'+json[i].weburl+'" target="_blank">'+json[i].stationName+'</a></li>';
				}
				$(".js-friend-link").html(str);
			}
		}).always(function(){
			family_loading();
		});
	}
	function showMsg(mes,callback,speed){
    	var message_html = '<div class="modal fade" tabindex="-1" role="dialog" id="msgModal"><div class="modal-dialog"><div class="modal-content"><div class="modal-header"><h5 class="modal-title">提示</h5></div><div class="modal-body"><span class="text-danger"></span></div></div></div></div>';

    	if(!speed){
			speed = 2000;
		}

		var $alert = $("#msgModal") ;
		if($alert.length <=0){
			$(document.body).append(message_html);
			$alert = $("#msgModal") ;
		}
		$alert.find(".modal-body span").html(mes);
		$alert.modal('show');
		
		setTimeout(function(){
			$alert.modal('hide');
			if(callback){
				callback();
			}
		},speed);
		
		$alert.on("hidden.bs.modal", function () {
			var index = 0;
			$(".modal").each(function(){
				if($(this).css("display") !== "none") index += 1;
			});
			if(index > 0){
				$("body").addClass("modal-open");
			}else{
				$("body").removeClass("modal-open");
			}
			$alert.off("hidden.bs.modal");
		});
	}
})