<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thống kê - Sản phẩm</title>
</head>

<body>
    <h1 class="mt-4">Quản lý sản phẩm</h1>
    <ol class="breadcrumb mb-4">
        <li class="breadcrumb-item">Thống kê</li>
        <li class="breadcrumb-item">Quản lý sản phẩm</li>
        <li class="breadcrumb-item active">Danh sách sản phẩm</li>
    </ol>
    <div class="card mb-4">
        <div class="card-header">
            <i class="fas fa-table mr-1"></i>
            Danh sách sản phẩm
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Hình ảnh</th>
                            <th>Sản phẩm</th>
                            <th>Danh mục</th>
                            <th>Giá</th>
                            <th>Số lượng</th>
                            <th>Đã bán</th>
                            <th>Tác vụ</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="item" items="${model.listResult}">
                            <tr>
                                <td class="align-middle">
                                    <div class="bg-img"
                                         style="background-image: url('<c:url
                                                 value="/images/products/${item.categoryCode}/${item.cover}.jpg"/>');">
                                    </div>
                                </td>
                                <td class="align-middle">${item.name}</td>
                                <td class="align-middle">${item.categoryCode}</td>
                                <td class="align-middle">${item.price}</td>
                                <td class="align-middle">245</td>
                                <td class="align-middle">1200</td>
                                <td class="align-middle">
                                    <i class="far fa-edit mr-1" aria-hidden="true"></i>
                                    <i class="far fa-trash-alt ml-1" aria-hidden="true"></i>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
