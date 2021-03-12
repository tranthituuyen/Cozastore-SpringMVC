<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="../../common/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thống kê</title>
</head>

<body>
    <h1 class="mt-4">Thống kê</h1>
    <ol class="breadcrumb mb-4">
        <li class="breadcrumb-item active">Thống kê</li>
    </ol>
    <div class="row">
        <div class="col-xl-4 col-md-6">
            <div class="card bg-primary text-white mb-4">
                <div class="card-body">25 sản phẩm</div>
                <div class="card-footer d-flex align-items-center justify-content-between">
                    <a class="small text-white stretched-link" href="#">Chi tiết</a>
                    <div class="small text-white"><i class="fas fa-angle-right"></i></div>
                </div>
            </div>
        </div>
        <div class="col-xl-4 col-md-6">
            <div class="card bg-warning text-white mb-4">
                <div class="card-body">25 đơn hàng chờ xử lý</div>
                <div class="card-footer d-flex align-items-center justify-content-between">
                    <a class="small text-white stretched-link" href="#">Chi tiết</a>
                    <div class="small text-white"><i class="fas fa-angle-right"></i></div>
                </div>
            </div>
        </div>
        <div class="col-xl-4 col-md-6">
            <div class="card bg-success text-white mb-4">
                <div class="card-body">12500 đơn hàng đã bán</div>
                <div class="card-footer d-flex align-items-center justify-content-between">
                    <a class="small text-white stretched-link" href="#">Chi tiết</a>
                    <div class="small text-white"><i class="fas fa-angle-right"></i></div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-xl-6">
            <div class="card mb-4">
                <div class="card-header">
                    <i class="fas fa-chart-area mr-1"></i>
                    Thống kê doanh thu
                </div>
                <div class="card-body">
                    <canvas id="myAreaChart" width="100%" height="40"></canvas>
                </div>
            </div>
        </div>
        <div class="col-xl-6">
            <div class="card mb-4">
                <div class="card-header">
                    <i class="fas fa-chart-bar mr-1"></i>
                    Thống kê đơn hàng
                </div>
                <div class="card-body">
                    <canvas id="myBarChart" width="100%" height="40"></canvas>
                </div>
            </div>
        </div>
    </div>

    <%--  database example  --%>
    <div class="row">
        <div class="col-xl-7 col-md-12">
            <div class="card mb-4">
                <div class="card-header">
                    <i class="fas fa-table mr-1"></i>
                    Sản phẩm bán chạy
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table class="table table-bordered" id="dataTrendingProducts" width="100%" cellspacing="0">
                            <thead>
                                <tr>
                                    <th>Hình ảnh</th>
                                    <th>Sản phẩm</th>
                                    <th>Giá</th>
                                    <th>Đã bán</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>img img</td>
                                    <td>SSStutter áo sơ mi gì đó quên tên ời</td>
                                    <td>125000</td>
                                    <td>1200</td>
                                </tr>
                                <tr>
                                    <td>img img</td>
                                    <td>SSStutter áo sơ mi gì đó quên tên ời</td>
                                    <td>125000</td>
                                    <td>1200</td>
                                </tr>
                                <tr>
                                    <td>img img</td>
                                    <td>SSStutter áo sơ mi gì đó quên tên ời</td>
                                    <td>125000</td>
                                    <td>1200</td>
                                </tr>
                                <tr>
                                    <td>img img</td>
                                    <td>SSStutter áo sơ mi gì đó quên tên ời</td>
                                    <td>125000</td>
                                    <td>1200</td>
                                </tr>
                                <tr>
                                    <td>img img</td>
                                    <td>SSStutter áo sơ mi gì đó quên tên ời</td>
                                    <td>125000</td>
                                    <td>1200</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-xl-5 col-md-12">
            <div class="card mb-4">
                <div class="card-header">
                    <i class="fas fa-table mr-1"></i>
                    Đơn hàng gần đây
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table class="table table-bordered" id="dataRecentOrder" width="100%" cellspacing="0">
                            <thead>
                                <tr>
                                    <th>Mã</th>
                                    <th>Khách hàng</th>
                                    <th>Trạng thái</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>#21120301</td>
                                    <td>Nguyễn Vu</td>
                                    <td>Shipped</td>
                                </tr>
                                <tr>
                                    <td>#21120301</td>
                                    <td>Nguyễn Vu</td>
                                    <td>Shipped</td>
                                </tr>
                                <tr>
                                    <td>#21120301</td>
                                    <td>Nguyễn Vu</td>
                                    <td>Shipped</td>
                                </tr>
                                <tr>
                                    <td>#21120301</td>
                                    <td>Nguyễn Vu</td>
                                    <td>Shipped</td>
                                </tr>
                                <tr>
                                    <td>#21120301</td>
                                    <td>Nguyễn Vu</td>
                                    <td>Shipped</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>

<%--    --%>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
    <script src="<c:url value='/templates/admin/assets/demo/chart-area-demo.js' />"></script>
    <script src="<c:url value='/templates/admin/assets/demo/chart-bar-demo.js'/>"></script>
</body>
</html>