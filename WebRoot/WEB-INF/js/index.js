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
	$("body").on('click','.xupu-surnames > div',function(){
		$(this).addClass('active').siblings().removeClass('active');;
	})
	$("body").on('mouseover','.js-surname-item',function(){
		var content = $(this).attr('data-info');

		$(".js-surname-info").html(content);
	})
	/*$("#surnameInfor").click(function(){
		var moduleId = $(this).attr('data-moduleId');
		window.location.href = 'information?id='+moduleId;
	});*/
	
})