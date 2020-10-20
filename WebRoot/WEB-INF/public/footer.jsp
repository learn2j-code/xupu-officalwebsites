<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<footer class="mt25">
		<div class="container clearfix">
			<div class="xupu-frient-link-wrap clearfix">
				<h5 class="xupu-title">友情链接</h5>
				<ul class="xupu-friend-link clearfix">
					<c:forEach items="${webInfo.slinkurlList}" var="slinkurlList">
					<c:choose><c:when test="${slinkurlList.delFlg == 0}"> <li><a href="http://${slinkurlList.weburl}" target="_blank">${slinkurlList.stationName}</a></li>  </c:when>
					<c:otherwise></c:otherwise>
					</c:choose>
					</c:forEach>
				</ul>
			</div>
			
			<div class="flex">
				<div class="xupu-crop-info">
					<span>
						地址: 湖南省长沙岳麓区江岸景苑B座412室
					</span>
					<span>
						Copyright © 2017 - <i id="js-copyright-cur-date">2019</i> 湖南叙谱文化传播有限公司 版权所有
					</span>
					<span>
						<a href="http://beian.miit.gov.cn" target="_blank">湘ICP备17021134号-4</a>
					</span>
				</div>
				<div>
					<h5  class="xupu-title mt25">联系我们</h5>
					<ul class="xupu-contact mt15">
						<li><i class="fa fa-phone"></i>
							<div class="phone">
								<p><i class="fa fa-phone"></i>&ensp;15273121398</p>
							</div>
						</li>
						<li>
							<i class="fa fa-weixin"></i>
							<div class="weixin">
								<img src="images/weixin.png">
							</div>
						</li>
						<li>      <i class="fa fa-qq"></i>
							<div class="qq">
								<img src="images/qq.png">
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="text-center xupu-footer-title">叙谱文化以中华<a href="http://www.xupu360.com/news">姓氏文化</a>为基点,助千万人<a href="http://pcxunzu.100tp.cn">寻祖</a></div>
		<script>
			(function(){
			var curDate = new Date();
			var curYear = curDate.getFullYear();
			document.getElementById("js-copyright-cur-date").innderHTML = curYear;
    		var bp = document.createElement('script');
    		bp.src = "http://push.zhanzhang.baidu.com/push.js";
    		var s = document.getElementsByTagName("script")[0];
    		s.parentNode.insertBefore(bp, s);
			})();
		</script>
	</footer>