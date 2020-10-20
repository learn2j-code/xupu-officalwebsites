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
	var articleId = GetQueryString('id')||'';
	params.id = articleId;
	family_loading();
	$.ajax({
		url:URL+'findArticalContentByArticalId',
		data:JSON.stringify(params),
		type: "POST",
		contentType: "application/json;charset=utf-8"
	}).done(function(json){
		if(json.id){
			$(".js-surname-title").html(json.title);
			$(".js-article-content").html(json.content);
			var timeStr = json.articleTime.substr(0,10)
			$(".js-article-time").html(timeStr);
		}
	}).always(function(){
		family_loading();
	});
	loadSurnameInformation();
	loadXuZuInformation();
	loadFriendLink();
	
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
					str+='<li title="'+json[i].title+'"><a href="news/articleDetail?id='+json[i].id+'">'+json[i].title+'</a></li>';
				}
				$(".js-surname-infor-list").html(str);
			}
		})
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
					if(json[i].delFlg != '1'){
						str+='<li><a href="http://'+json[i].weburl+'">'+json[i].stationName+'</a></li>';
					}
				}
				$(".js-friend-link").html(str);
			}
		}).always(function(){
			family_loading();
		});
	}
})