<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <title><decorator:title default="Thống kê"/></title>
    <link rel="stylesheet" href="<c:url value='/templates/admin/css/styles.css' />">
    <link href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css" rel="stylesheet"
          crossorigin="anonymous"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"
            crossorigin="anonymous"></script>
</head>

<body class="sb-nav-fixed">
    <%@ include file="/common/admin/navbar.jsp" %>

    <div id="layoutSidenav">
        <%@ include file="/common/admin/side-navbar.jsp" %>

        <div id="layoutSidenav_content">
            <main>
                <div class="container-fluid">
                    <decorator:body/>
                </div>
            </main>

            <%@ include file="/common/admin/footer.jsp" %>
        </div>
    </div>

    <%--  jquery  --%>
    <script src="<c:url value="/templates/common/jquery/jquery-3.2.1.min.js"/>"></script>
    <script src="<c:url value="/templates/common/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
    <script src="<c:url value="/templates/admin/js/scripts.js"/>"></script>
    <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
    <script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js" crossorigin="anonymous"></script>
    <script src="<c:url value="/templates/admin/assets/demo/datatables-demo.js"/>"></script>
</body>
</html>
