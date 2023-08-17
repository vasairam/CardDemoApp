<!DOCTYPE html>
<%@ page import="java.util.*" %>
<%@ page import="com.cg.CardDemoApplication.model.*" %>
com.cg.CardDemoApplication.model
<html
  lang="en"
  class="light-style layout-navbar-fixed layout-menu-fixed"
  dir="ltr"
  data-theme="theme-default"
  data-assets-path="../assets/"
  data-template="vertical-menu-template"
>
  <head>
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0"
    />

    <title> Add User | Card Demo </title>

    <meta name="description" content="" />

    <!-- Favicon -->
    <link rel="icon" type="image/x-icon" href="../assets/img/favicon/favicon.ico" />

    <!-- Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Public+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap"
      rel="stylesheet"
    />

    <!-- Icons -->
    <link rel="stylesheet" href="../assets/vendor/fonts/fontawesome.css" />
    <link rel="stylesheet" href="../assets/vendor/fonts/tabler-icons.css" />
    <link rel="stylesheet" href="../assets/vendor/fonts/flag-icons.css" />

    <!-- Core CSS -->
    <link rel="stylesheet" href="../assets/vendor/css/rtl/core.css" class="template-customizer-core-css" />
    <link rel="stylesheet" href="../assets/vendor/css/rtl/theme-default.css" class="template-customizer-theme-css" />
    <link rel="stylesheet" href="../assets/css/demo.css" />
    <link rel="stylesheet" href="../assets/css/custom.css" />

    <!-- Vendors CSS -->
    <link rel="stylesheet" href="../assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.css" />
    <link rel="stylesheet" href="../assets/vendor/libs/node-waves/node-waves.css" />
    <link rel="stylesheet" href="../assets/vendor/libs/typeahead-js/typeahead.css" />
    <link rel="stylesheet" href="../assets/vendor/libs/apex-charts/apex-charts.css" />
    <link rel="stylesheet" href="../assets/vendor/libs/swiper/swiper.css" />
    <link rel="stylesheet" href="../assets/vendor/libs/datatables-bs5/datatables.bootstrap5.css" />
    <link rel="stylesheet" href="../assets/vendor/libs/datatables-responsive-bs5/responsive.bootstrap5.css" />
    <link rel="stylesheet" href="../assets/vendor/libs/datatables-checkboxes-jquery/datatables.checkboxes.css" />

    <!-- Page CSS -->
    <link rel="stylesheet" href="../assets/vendor/css/pages/cards-advance.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />

    <!-- Helpers -->
    <script src="../assets/vendor/js/helpers.js"></script>
    
    <script>
        function createUser() {
       // alert("called");
  
            // Request
            const form = document.getElementById("createUser");
            var request = new XMLHttpRequest();
            var data = new FormData(form);
            request.open("POST","/user/register");
            request.send(data);
  
            // Response
            request.onreadystatechange = function () {
                if (this.readyState == 4 
                    && this.status == 200) {
                    alert("User Created Successfully...!");
					form.reset();
                }
            }
        }
    </script>

    <!--! Template customizer & Theme config files MUST be included after core stylesheets and helpers.js in the <head> section -->
    <!--? Template customizer: To hide customizer set displayCustomizer value false in config.js.  -->
    <!-- <script src="../assets/vendor/js/template-customizer.js"></script> -->
    <!--? Config:  Mandatory theme config file contain global vars & default theme options, Set your preferred theme option in this file.  -->
    <script src="../assets/js/config.js"></script>
  </head>

  <body>
    <!-- Layout wrapper -->
    <div class="layout-wrapper layout-content-navbar">
      <div class="layout-container">
        <!-- Menu -->

        <aside id="layout-menu" class="layout-menu menu-vertical menu bg-menu-theme">
          <div class="app-brand demo">
            <a href="#" class="app-brand-link">
              <span class="app-brand-logo demo">
                <img src="../assets/img/branding/logo-img.png" alt="" title="" width="50"/>
              </span>
              <span class="app-brand-text demo menu-text fw-bold">
                <img src="../assets/img/branding/logo-txt.png" alt="" title="" height="50" width="120"/>
              </span>
            </a>

            <a href="javascript:void(0);" class="layout-menu-toggle menu-link text-large ms-auto">
              <i class="ti menu-toggle-icon d-none d-xl-block ti-sm align-middle"></i>
              <i class="ti ti-x d-block d-xl-none ti-sm align-middle"></i>
            </a>
          </div>

          <div class="menu-inner-shadow"></div>

          <ul class="menu-inner py-1">
            <li class="menu-item">
              <a href="javascript:void(0);" class="menu-link menu-toggle">
                <i class="menu-icon fa-solid fa-users"></i>
                <div data-i18n="Users">Users</div>
              </a>
              <ul class="menu-sub">
                <li class="menu-item">
                  <a href="/addUser" class="menu-link">
                    <div data-i18n="Add Users"> Add User</div>
                  </a>
                </li>
                <li class="menu-item">
                  <a href="/updateUser" class="menu-link" method="POST" >
                    <div data-i18n="Update User">Update User</div>
                  </a>
                </li>
				 <li class="menu-item">
                  <a href="/deleteUser" class="menu-link">
                    <div data-i18n="Delete User">Delete User</div>
                  </a>
                </li>
				 <li class="menu-item">
                  <a href="/viewUsers" class="menu-link">
                    <div data-i18n="View Users">View Users</div>
                  </a>
                </li>
              </ul>
            </li>        
               				
			
          </ul>
        </aside>
        <!-- / Menu -->

        <!-- Layout container -->
        <div class="layout-page">
          <!-- Navbar -->

          <nav
            class="layout-navbar container-xxl navbar navbar-expand-xl navbar-detached align-items-center bg-navbar-theme"
            id="layout-navbar"
          >
            <div class="layout-menu-toggle navbar-nav align-items-xl-center me-3 me-xl-0 d-xl-none">
              <a class="nav-item nav-link px-0 me-xl-4" href="javascript:void(0)">
                <i class="ti ti-menu-2 ti-sm"></i>
              </a>
            </div>

            <div class="navbar-nav-right d-flex align-items-center" id="navbar-collapse">
              <!-- Search -->
              <!-- Search -->
              <div class="navbar-nav align-items-center">
                <div class="nav-item navbar-search-wrapper mb-0">
                  <a class="nav-item nav-link search-toggler d-flex align-items-center px-0" href="javascript:void(0);">
                    <i class="ti ti-search ti-md me-2"></i>
                    <span class="d-none d-md-inline-block text-muted">Search (Ctrl+/)</span>
                  </a>
                </div>
              </div>
              <!-- /Search -->

              <ul class="navbar-nav flex-row align-items-center ms-auto">
                
                  </ul>
                </li>
                <!--/ Language -->

                

                <!-- User -->
                <li class="nav-item navbar-dropdown dropdown-user dropdown">
                  <a class="nav-link dropdown-toggle hide-arrow" href="javascript:void(0);" data-bs-toggle="dropdown">
                    <div class="avatar avatar-online">
                      <img src="../assets/img/avatars/1.png" alt class="h-auto rounded-circle" />
                    </div>
                  </a>
                  <ul class="dropdown-menu dropdown-menu-end">
                    <li>
                      <a class="dropdown-item" href="pages-account-settings-account.html">
                        <div class="d-flex">
                          <div class="flex-shrink-0 me-3">
                            <div class="avatar avatar-online">
                              <img src="../assets/img/avatars/1.png" alt class="h-auto rounded-circle" />
                            </div>
                          </div>
                          <div class="flex-grow-1">
                            <%  User sessionUser = (User) session.getAttribute("loggedInUser");
                                String userFirstName = sessionUser.getFirstName();
                                String userLastName = sessionUser.getLastName();
                            %>
                              <span class="fw-semibold d-block"><%=userFirstName%> <%=userLastName%></span>
                              <small class="text-muted"><%=sessionUser.getRole()%></small>
                            </div>
                        </div>
                      </a>
                    </li>
                    <li>
                      <div class="dropdown-divider"></div>
                    </li>
                    <li>
                      <a class="dropdown-item" href="pages-profile-user.html">
                        <i class="ti ti-user-check me-2 ti-sm"></i>
                        <span class="align-middle">My Profile</span>
                      </a>
                    </li>
                                        <li>
                      <a class="dropdown-item" href="/login">
                        <i class="ti ti-logout me-2 ti-sm"></i>
                        <span class="align-middle">Log Out</span>
                      </a>
                    </li>
                  </ul>
                </li>
                <!--/ User -->
              </ul>
              </ul>
            </div>

            <!-- Search Small Screens -->
            <div class="navbar-search-wrapper search-input-wrapper d-none">
              <input
                type="text"
                class="form-control search-input container-xxl border-0"
                placeholder="Search..."
                aria-label="Search..."
              />
              <i class="ti ti-x ti-sm search-toggler cursor-pointer"></i>
            </div>
          </nav>

          <!-- / Navbar -->
		  <div class="content-wrapper">
            <!-- Content -->

            <div class="container-xxl flex-grow-1 container-p-y">
			<h4 class="fw-bold "><span class="text-muted fw-light">User /</span> Add</h4>
              <div class="row">
			  
                <!-- Website Analytics -->
                <div class="col-12">
                  <div class="card">
                   
                    <div class="card-body">
                      <form id="createUser" class="row g-3" action="#" >
                        <!-- Account Details -->

                        <div class="col-12">
                          <h6 class="fw-semibold">User</h6>
                          <hr class="mt-0" />
                        </div>

                        <div class="col-md-4">
                          <label class="form-label" >User Name</label>
                          <input
                            class="form-control"
                            type="text"
                            id="username"
                            name="username"
                            placeholder="User Name"
							value=""					
							/>
                        </div>

                        <div class="col-md-4">
                          
                            <label class="form-label" >First Name</label>
                          <input
                            class="form-control"
                            type="text"
                            id="firstname"
                            name="firstName"
                            placeholder=" First Name"
							value=""					
							/>  
							</div>
                        
                        <div class="col-md-4">
                         <label class="form-label" >Last Name</label>
                          <input
                            class="form-control"
                            type="text"
                            id="lastname"
                            name="lastName"
                            placeholder="Last Name"
							value=""					
							/>                        
						</div>
                         <div class="col-md-4">
                          <label class="form-label" >Role</label>
                          <div class="input-group">
                            <label class="input-group-text" for="inputGroupSelect01">Role</label>
                            <select class="form-select" id="inputGroupSelect01" name="role">
                              <option selected>Choose...</option>
                              <option value="Admin">Admin</option>
                              <option value="user">User</option>
                             </select>
                          </div>
                        </div>
						<div class="col-md-4">
                          <label class="form-label" >Password</label>
						<div class="input-group">
                          <input
                            type="password"
                            class="form-control"
                            id="basic-default-password12"
                            placeholder="&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;"
                            aria-describedby="basic-default-password2" name= "password" />
                          <span id="basic-default-password2" class="input-group-text cursor-pointer"
                            ><i class="ti ti-eye-off"></i
                          ></span>
                        </div>
                        </div>
						
					  </div>
						<div class="col-4">		
                          <button type="button" name="submitButton" onclick="return createUser()" class="btn btn-primary">Add User</button>
                        </div>
                       </form>
                    </div>
                  </div>
                </div>
                <!-- /FormValidation -->
            </div>
            <!-- / Content -->

           

            <div class="content-backdrop fade"></div>
          </div>
          <!-- Content wrapper -->
		  

         
             <!-- Footer -->
             <footer class="content-footer footer bg-footer-theme">
              <div class="container-xxl">
                <div
                  class="footer-container d-flex align-items-center justify-content-between py-2 flex-md-row flex-column"
                >
                  <div>
                    ©
                    <script>
                      document.write(new Date().getFullYear());
                    </script>
                    , copy rights reserved <a href="https://www.capgemini.com/" target="_blank" class="fw-semibold">CAPGEMINI TECHNOLOGIES SERVICES PVT LTD..</a>
                  </div>
                 
                </div>
              </div>
            </footer>
            <!-- / Footer -->

            <div class="content-backdrop fade"></div>
          </div>
          <!-- Content wrapper -->
        </div>
        <!-- / Layout page -->
      </div>

      <!-- Overlay -->
      <div class="layout-overlay layout-menu-toggle"></div>

      <!-- Drag Target Area To SlideIn Menu On Small Screens -->
      <div class="drag-target"></div>
    </div>
    <!-- / Layout wrapper -->

    <!-- Core JS -->
    <!-- build:js assets/vendor/js/core.js -->
    <script src="../assets/vendor/libs/jquery/jquery.js"></script>
    <script src="../assets/vendor/libs/popper/popper.js"></script>
    <script src="../assets/vendor/js/bootstrap.js"></script>
    <script src="../assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.js"></script>
    <script src="../assets/vendor/libs/node-waves/node-waves.js"></script>

    <script src="../assets/vendor/libs/hammer/hammer.js"></script>
    <script src="../assets/vendor/libs/i18n/i18n.js"></script>
    <script src="../assets/vendor/libs/typeahead-js/typeahead.js"></script>

    <script src="../assets/vendor/js/menu.js"></script>
    <!-- endbuild -->

    <!-- Vendors JS -->
    <script src="../assets/vendor/libs/apex-charts/apexcharts.js"></script>
    <script src="../assets/vendor/libs/swiper/swiper.js"></script>
    <script src="../assets/vendor/libs/datatables-bs5/datatables-bootstrap5.js"></script>

    <!-- Main JS -->
    <script src="../assets/js/main.js"></script>

    <!-- Page JS -->
    <script src="../assets/js/dashboards-analytics.js"></script>
  </body>
</html>
