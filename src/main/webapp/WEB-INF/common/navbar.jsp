
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Static navbar -->
<nav class="navbar navbar-default" style="margin:0px">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">PMS 1.0</a>
    </div>
    <div id="navbar" class="navbar-collapse collapse">
      <%--<ul class="nav navbar-nav">--%>
        <%--<li class="active"><a href="#">Home</a></li>--%>
        <%--<li class="dropdown">--%>
          <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"--%>
             <%--aria-expanded="false">User<span class="caret"></span></a>--%>
          <%--<ul class="dropdown-menu">--%>
            <%--<li><a href="<c:url value="/user/add" />">Add User</a></li>--%>
            <%--<li><a href="<c:url value="/user/list" />">User List</a></li>--%>
          <%--</ul>--%>
        <%--</li>--%>
        <%--<li class="dropdown">--%>
          <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"--%>
             <%--aria-expanded="false">Project<span class="caret"></span></a>--%>
          <%--<ul class="dropdown-menu">--%>
            <%--<li><a href="<c:url value="/project/add" />">Add Project</a></li>--%>
            <%--<li><a href="<c:url value="/project/list" />">Project List</a></li>--%>
          <%--</ul>--%>
        <%--</li>--%>
      <%--</ul>--%>
      <ul class="nav navbar-nav navbar-right">
        <li class="active"><a href="<c:url value="/j_spring_security_logout" />">注销</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="navbar-brand"></li>
      </ul>
      <c:if test="${pageContext.request.userPrincipal.name ne null}">
        <ul class="nav navbar-nav navbar-right">
          <li class="active"><a
                  href="<c:url value="/student/add?username=${pageContext.request.userPrincipal.name}" />">${pageContext.request.userPrincipal.name}</a>
          </li>
        </ul>
      </c:if>
      <c:if test="${pageContext.request.userPrincipal.name eq null}">
        <ul class="nav navbar-nav navbar-right">
          <li class="active"><a href="<c:url value="/login" />">登录</a></li>
        </ul>
      </c:if>
    </div>
    <!--/.nav-collapse -->
  </div>
  <!--/.container-fluid -->
</nav>
<div class="row">
  <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
    <%--<ol class="carousel-indicators">--%>
      <%--&lt;%&ndash;<li data-target="#carousel-example-generic" data-slide-to="0" class=""></li>&ndash;%&gt;--%>
      <%--&lt;%&ndash;<li class="" data-target="#carousel-example-generic" data-slide-to="1"></li>&ndash;%&gt;--%>
      <%--&lt;%&ndash;<li class="active" data-target="#carousel-example-generic" data-slide-to="2"></li>&ndash;%&gt;--%>
    <%--</ol>--%>
    <div class="carousel-inner" role="listbox">
      <div class="item" style=" height:90px;">
        <img data-holder-rendered="true" src="/img/1.jpg">
      </div>
      <div class="item" style=" height:90px;">
        <img data-holder-rendered="true" src="/img/2.jpg">
      </div>
      <div class="item active" style=" height:90px;">
        <img data-holder-rendered="true" src="/img/3.jpg">
      </div>
    </div>
    <%--<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">--%>
      <%--<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>--%>
      <%--<span class="sr-only">Previous</span>--%>
    <%--</a>--%>
    <%--<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">--%>
      <%--<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>--%>
      <%--<span class="sr-only">Next</span>--%>
    <%--</a>--%>
  </div>
</div>