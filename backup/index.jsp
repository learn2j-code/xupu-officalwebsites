<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
	<base href="<%=basePath%>">
	<link rel="shortcut icon" href="favicon.ico">
	<title>叙谱文化—百家姓_姓氏源流_寻根问祖</title>
	<meta name="keywords" content="${webInfo.swebsite.keyword}">
	<meta name="description" content="${webInfo.swebsite.websiteAbstract}">
	<meta name="baidu-site-verification" content="mWtQvYYCp3" />
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="css/swiper.min.css">
	<link rel="stylesheet" type="text/css" href="css/index.css">
	<script>
	var _hmt = _hmt || [];
	(function() {
	  var hm = document.createElement("script");
	  hm.src = "https://hm.baidu.com/hm.js?a8eacd7d1a5460cef8d9b15903878aac";
	  var s = document.getElementsByTagName("script")[0]; 
	  s.parentNode.insertBefore(hm, s);
	})();
	</script>
</head>
<body>
	<header>
		<div class="container">
			<div class="xupu-logo pull-left">
				
			</div>
			<div class="pull-left xupu-logo-title">弘扬中华姓氏文化,传承千年家族遗风</div>
			<div class="xupu-logo-right pull-right">
				<div class="xupu-login-btn-group pull-right">
					<a href="javascript:void(0);">登录</a>
					<a href="javascript:void(0);">注册</a>
				</div>
				<div class="xupu-date pull-right flex">
					<div class="clearflex"><i class="fa fa-calendar"></i></div>
					<div>
						<div class="f12 js-current-date">2018-03-21</div>
						<div class="js-current-old-date">戊戌年狗年二月初五</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<nav>
		<ul class="container xupu-nav-items">
			<li class="li active"><a href="/">首页</a></li>
			<li class="li"><a href="news">姓氏文化</a></li>
			<li class="li"><a href="http://pcxunzu.100tp.cn" target="_blank">寻根问祖</a></li>
			<li class="li"><a href="http://www.100citang.cn" target="_blank">家族祠堂</a></li>
			<li class="li"><a href="about">关于叙谱</a></li>
			<li class="li"><a href="clanBookShow">族谱展示</a></li>
		</ul>
	</nav>
	<main class="container">
		<div class="xupu-banner-wrap mt18 swiper-container">
			<ul class="xupu-banner swiper-wrapper">
				<li class="swiper-slide"><img src="images/banner1.png" alt='刘强东寻祖'></li>
				<li class="swiper-slide"><img src="images/banner2.png" alt='百里挑一，家谱传承'></li>
				<li class="swiper-slide"><img src="images/banner3.png" alt='祠堂功德碑'></li>
				<li class="swiper-slide"><a href="http://www.100citang.cn" target="_blank"><img src="images/banner4.png" alt='宗祠万里，千年传承' style="height: 100%;"></a></li>
			</ul>
			<div class="swiper-pagination family-pagination"></div>
		</div>
		<div class="xupu-surnames-wrap mt18">
			<%-- <div class="row">
				<div class="col-lg-8 col-md-8 col-sm-6 col-xs-12">
					<h5 class="xupu-title">百家姓<a href="baijiaxing" class="pull-right">更多</a></h5>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
					<div class="xupu-search-wrap">
						<input type="text" name="" class="xupu-search-input">
					</div>
				</div>
			</div>
			<div class="row mhn gray-bg ba-1" style="margin-top: 15px;">
				<div class="col-lg-8 col-md-8 col-sm-6 col-xs-12 flex xupu-surnames phn">
					<c:forEach items="${bjxList}" var="bjxList">
						<div class="clearflex js-surname-item" data-info='${bjxList.articalAbstract}'><a href="baijiaxing/articleDetail?id=${bjxList.id}">${bjxList.title}</a></div>
					</c:forEach>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 xupu-surname-info ">
					<h4 class="text-center"><strong>姓氏渊源</strong></h4>
					<div class="js-surname-info">
						${bjxList[0].articalAbstract}
					</div>
				</div>
			</div> --%>
			<div class="row mhn mt18">
				<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12" style="padding-right: 15px;padding-left:0px">
					<h5 class="xupu-title"><font>姓氏文化</font><a id="surnameInfor" data-moduleId="${webInfo.xszxModuleId}" href='news?moduleType=1&id=2' class="pull-right">更多</a></h5>
					
					<c:forEach items="${xszyList}" var="xszyList">
					<div class="flex xupu-infomation-item mt15">
						<div class="clearflex">
							<a href="news/articleDetail?id=${xszyList.id}"><c:choose><c:when test="${xszyList.imageUrl == null}"><div class="default-img-wrap"><img src="images/default.png"></div></c:when><c:otherwise><img src="http://image.100citang.cn:9880/seo${xszyList.imageUrl}"></c:otherwise></c:choose></a>
						</div>
						<div class="xupu-infomation-item-text">
							<p class="title" title="${xszyList.title}"><a href="news/articleDetail?id=${xszyList.id}">${xszyList.title}</a></p>
							<p class="abstract"><a href="news/articleDetail?id=${xszyList.id}">${xszyList.articalAbstract}</a></p>
							<span class="xupu-infomation-item-time"><fmt:formatDate value="${xszyList.releaseDate}" pattern="yyyy-MM-dd"/></span>
						</div>
					</div>
					</c:forEach>
					
				</div>
				<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12 phn">
					<h5 class="xupu-title">寻祖资訊<a  href='news?moduleType=2&id=3' class="pull-right">更多</a></h5>
					
					<c:forEach items="${xzzxList}" var="xzzxList">
					<div class="flex mt15 xupu-infomation-item">
						<div class="clearflex">
							<a href="news/articleDetail?id=${xzzxList.id}"><c:choose><c:when test="${xzzxList.imageUrl == null}"><div class="default-img-wrap"><img src="images/default.png"></div></c:when><c:otherwise><img src="http://image.100citang.cn:9880/seo${xzzxList.imageUrl}"></c:otherwise></c:choose></a>
						</div>
						<div class="xupu-infomation-item-text">
							<p  class="title" title="${xzzxList.title}"><a href="news/articleDetail?id=${xzzxList.id}">${xzzxList.title}</a></p>
							<p class="abstract"><a href="news/articleDetail?id=${xzzxList.id}">${xzzxList.articalAbstract}</a></p>
							<span class="xupu-infomation-item-time"><fmt:formatDate value="${xzzxList.releaseDate}" pattern="yyyy-MM-dd"/></span>
						</div>
					</div>
					</c:forEach>
				</div>
			</div>
			<div class="mt18">
				<h5 class="xupu-title">关于叙谱</h5>
				<div class="row mhn gray-bg">
					<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12 phn xupu-about-img">
						<img src="images/img7.png">
					</div>
					<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12 phn text-center">
						<div class="xupu-about-content">
							<p>湖南叙谱文化传播有限公司以家族传统文化为基点，构建O2O家族（庭）社区互联网平台，助千万人寻根，扶上亿家庭建档。</p>

<p>叙谱文化秉承“亲情、合作、传承”的企业理念，追宗溯祖，收拢宗族，凝聚人心，建数万宗亲会，联十万媒体人，写百万家庭史。</p>

<p>叙谱文化以华人华侨（族谱）大数据为企业基石，为全球华人提供数字化、结构化的族谱编修（纸谱电子谱同修）、家史传记策划写作、家文化（宗亲）产品订制、家文化图书出版发行及宗亲组织协助建设与咨询等多样化服务。</p>

						</div>
						<a href="about" class="xupu-more-btn mt45 mb20">
							查看更多
						</a>
					</div>
				</div>
			</div>
		</div>
	</main>
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
						Copyright © 2018 湖南叙谱文化传播有限公司版权所有
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
    		var bp = document.createElement('script');
    		bp.src = "http://push.zhanzhang.baidu.com/push.js";
    		var s = document.getElementsByTagName("script")[0];
    		s.parentNode.insertBefore(bp, s);
			})();
		</script>
	</footer>
	<script type="text/javascript" src="js/public/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="js/public/swiper-4.1.6.min.js"></script>
	<script src="js/public/calendar-converter.js"></script>
	<script type="text/javascript" src="js/public/common.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
</body>
</html>