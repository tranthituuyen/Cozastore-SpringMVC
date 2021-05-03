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
        <li class="breadcrumb-item active">Thêm sản phẩm</li>
    </ol>
    <div class="card mb-4">
        <!-- main content -->
        <div class="card shadow mb-4">
            <div class="card-body">
                <c:if test="${not empty messageResponse}">
                    <div class="alert alert-${alert} d-flex justify-content-between">
                            ${messageResponse}
                        <button class="btn btn-sm btn-success">Xem chi tiết</button>
                    </div>
                </c:if>
                <form id="formSubmitProduct">
                    <div class="row mt-3">
                        <div class="col flex-grow-1">
                            <div class="form-inline mb-2">
                                <label for="categoryCode" class="d-block edit-productModel-label">Danh mục:</label>
                                <select class="form-control flex-grow-1" name="categoryCode" id="categoryCode">
                                    <c:if test="${empty model.categoryCode}">
                                        <option value="">Chọn danh mục</option>
                                        <c:forEach var="item" items="${categories.listResult}">
                                            <option value="${item.code}">${item.name}</option>
                                        </c:forEach>
                                    </c:if>
                                    <c:if test="${not empty model.categoryCode}">
                                        <c:forEach var="item" items="${categories.listResult}">
                                            <option value="${item.code}"
                                                    <c:if test="${item.code == model.categoryCode}">selected="selected"</c:if>>
                                                    ${item.name}</option>
                                        </c:forEach>
                                    </c:if>
                                </select>
                            </div>

                            <div class="form-inline mb-2">
                                <label for="code" class="d-block edit-productModel-label">Mã sản phẩm:</label>
                                <input type="text" id="code" name="code" value="${model.code}"
                                       class="form-control flex-grow-1"/>
                            </div>

                            <div class="form-inline mb-2">
                                <label for="name" class="d-block edit-productModel-label">Tên sản phẩm:</label>
                                <input type="text" id="name" name="name" value="${model.name}"
                                       class="form-control flex-grow-1"/>
                            </div>

                            <div class="form-inline mb-2">
                                <label for="price" class="d-block edit-productModel-label">Giá:</label>
                                <input type="text" id="price" name="price" value="${model.price}"
                                       class="form-control flex-grow-1"/>
                            </div>

                            <div class="form-inline mb-2">
                                <label for="cover" class="d-block edit-productModel-label">Ảnh bìa:</label>
                                <input type="text" id="cover" name="cover" value="${model.cover}"
                                       class="form-control flex-grow-1"/>
                            </div>

                            <div class="form-inline mb-2">
                                <label for="status" class="d-block edit-productModel-label">Trạng thái:</label>
                                <select name="status" id="status" class="form-control flex-grow-1">
                                    <c:if test="${empty model.id}">
                                        <option value="true">Mở bán</option>
                                        <option value="false">Tạm hết hàng</option>
                                    </c:if>
                                    <c:if test="${not empty model.id}">
                                        <c:choose>
                                            <c:when test="${model.status == false}">
                                                <option value="false">Tạm hết hàng</option>
                                                <option value="true">Mở bán</option>
                                            </c:when>
                                            <c:otherwise>
                                                <option value="true">Mở bán</option>
                                                <option value="false">Tạm hết hàng</option>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:if>
                                </select>
                            </div>

                            <div class="d-flex justify-content-start">
                                <label class="d-block edit-productModel-label">Mô tả:</label>
                                <div class="flex-grow-1 mb-2">
                                <textarea class="form-control flex-grow-1" rows="7" id="description" name="description"
                                          type="text">${model.description}</textarea>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div>
                        <c:if test="${not empty model.id}">
                            <button class="btn btn-ms-primary float-right" id="btnAddOrUpdateProduct">
                                Cập nhật sản phẩm
                            </button>
                        </c:if>
                        <c:if test="${empty model.id}">
                            <button class="btn btn-ms-primary float-right" id="btnAddOrUpdateProduct">
                                Thêm sản phẩm
                            </button>
                        </c:if>
                    </div>
                    <input type="hidden" value="${model.id}" id="id" name="id"/>
                </form>
            </div>
        </div>
    </div>

    <script>
        function addProduct(data) {
            $.ajax({

            });
        }

        function updateProduct(data) {
            $.ajax({

            });
        }

        function deleteProduct(data) {
            $.ajax({

            });
        }
    </script>
</body>
</html>
