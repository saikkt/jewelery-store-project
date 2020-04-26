(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./$$_lazy_route_resource lazy recursive":
/*!******************************************************!*\
  !*** ./$$_lazy_route_resource lazy namespace object ***!
  \******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app-routing.module.ts":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/__ivy_ngcc__/fesm2015/router.js");
/* harmony import */ var _body_blocks_body_blocks_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./body-blocks/body-blocks.component */ "./src/app/body-blocks/body-blocks.component.ts");





const routes = [
    {
        path: '', pathMatch: 'full', redirectTo: 'home'
    },
    {
        path: 'home', component: _body_blocks_body_blocks_component__WEBPACK_IMPORTED_MODULE_2__["BodyBlocksComponent"]
    }
];
class AppRoutingModule {
}
AppRoutingModule.ɵmod = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineNgModule"]({ type: AppRoutingModule });
AppRoutingModule.ɵinj = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineInjector"]({ factory: function AppRoutingModule_Factory(t) { return new (t || AppRoutingModule)(); }, imports: [[_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"].forRoot(routes)],
        _angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"]] });
(function () { (typeof ngJitMode === "undefined" || ngJitMode) && _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵsetNgModuleScope"](AppRoutingModule, { imports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"]], exports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"]] }); })();
/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵsetClassMetadata"](AppRoutingModule, [{
        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"],
        args: [{
                imports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"].forRoot(routes)],
                exports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"]]
            }]
    }], null, null); })();


/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var _headers_headers_component__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./headers/headers.component */ "./src/app/headers/headers.component.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/__ivy_ngcc__/fesm2015/router.js");




class AppComponent {
}
AppComponent.ɵfac = function AppComponent_Factory(t) { return new (t || AppComponent)(); };
AppComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: AppComponent, selectors: [["app-root"]], decls: 3, vars: 0, consts: [[1, "body-blocks"]], template: function AppComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](0, "app-headers");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "div", 0);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](2, "router-outlet");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    } }, directives: [_headers_headers_component__WEBPACK_IMPORTED_MODULE_1__["HeadersComponent"], _angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterOutlet"]], styles: ["\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2FwcC5jb21wb25lbnQuc2NzcyJ9 */"] });
/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵsetClassMetadata"](AppComponent, [{
        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"],
        args: [{
                selector: 'app-root',
                templateUrl: './app.component.html',
                styleUrls: ['./app.component.scss']
            }]
    }], null, null); })();


/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/__ivy_ngcc__/fesm2015/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! angular-bootstrap-md */ "./node_modules/angular-bootstrap-md/__ivy_ngcc__/fesm2015/angular-bootstrap-md.js");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _headers_headers_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./headers/headers.component */ "./src/app/headers/headers.component.ts");
/* harmony import */ var _headers_top_header_top_header_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./headers/top-header/top-header.component */ "./src/app/headers/top-header/top-header.component.ts");
/* harmony import */ var _headers_bottom_header_bottom_header_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./headers/bottom-header/bottom-header.component */ "./src/app/headers/bottom-header/bottom-header.component.ts");
/* harmony import */ var _body_blocks_body_blocks_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./body-blocks/body-blocks.component */ "./src/app/body-blocks/body-blocks.component.ts");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./app-routing.module */ "./src/app/app-routing.module.ts");
/* harmony import */ var _body_blocks_carousel_block_carousel_block_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./body-blocks/carousel-block/carousel-block.component */ "./src/app/body-blocks/carousel-block/carousel-block.component.ts");
/* harmony import */ var _body_blocks_popular_collection_block_popular_collection_block_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./body-blocks/popular-collection-block/popular-collection-block.component */ "./src/app/body-blocks/popular-collection-block/popular-collection-block.component.ts");
/* harmony import */ var _body_blocks_new_arrivals_block_new_arrivals_block_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./body-blocks/new-arrivals-block/new-arrivals-block.component */ "./src/app/body-blocks/new-arrivals-block/new-arrivals-block.component.ts");
/* harmony import */ var _body_blocks_best_selling_block_best_selling_block_component__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./body-blocks/best-selling-block/best-selling-block.component */ "./src/app/body-blocks/best-selling-block/best-selling-block.component.ts");
/* harmony import */ var _body_blocks_contact_block_contact_block_component__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ./body-blocks/contact-block/contact-block.component */ "./src/app/body-blocks/contact-block/contact-block.component.ts");
/* harmony import */ var _services_home_loader_service__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! ./services/home-loader.service */ "./src/app/services/home-loader.service.ts");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/__ivy_ngcc__/fesm2015/http.js");


















class AppModule {
}
AppModule.ɵmod = _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵdefineNgModule"]({ type: AppModule, bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"]] });
AppModule.ɵinj = _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵdefineInjector"]({ factory: function AppModule_Factory(t) { return new (t || AppModule)(); }, providers: [_services_home_loader_service__WEBPACK_IMPORTED_MODULE_14__["HomeLoaderService"]], imports: [[
            _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
            _app_routing_module__WEBPACK_IMPORTED_MODULE_8__["AppRoutingModule"],
            _angular_common_http__WEBPACK_IMPORTED_MODULE_15__["HttpClientModule"],
            angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["MDBBootstrapModule"].forRoot()
        ]] });
(function () { (typeof ngJitMode === "undefined" || ngJitMode) && _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵsetNgModuleScope"](AppModule, { declarations: [_app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"],
        _headers_headers_component__WEBPACK_IMPORTED_MODULE_4__["HeadersComponent"],
        _headers_top_header_top_header_component__WEBPACK_IMPORTED_MODULE_5__["TopHeaderComponent"],
        _headers_bottom_header_bottom_header_component__WEBPACK_IMPORTED_MODULE_6__["BottomHeaderComponent"],
        _body_blocks_body_blocks_component__WEBPACK_IMPORTED_MODULE_7__["BodyBlocksComponent"],
        _body_blocks_carousel_block_carousel_block_component__WEBPACK_IMPORTED_MODULE_9__["CarouselBlockComponent"],
        _body_blocks_popular_collection_block_popular_collection_block_component__WEBPACK_IMPORTED_MODULE_10__["PopularCollectionBlockComponent"],
        _body_blocks_new_arrivals_block_new_arrivals_block_component__WEBPACK_IMPORTED_MODULE_11__["NewArrivalsBlockComponent"],
        _body_blocks_best_selling_block_best_selling_block_component__WEBPACK_IMPORTED_MODULE_12__["BestSellingBlockComponent"],
        _body_blocks_contact_block_contact_block_component__WEBPACK_IMPORTED_MODULE_13__["ContactBlockComponent"]], imports: [_angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
        _app_routing_module__WEBPACK_IMPORTED_MODULE_8__["AppRoutingModule"],
        _angular_common_http__WEBPACK_IMPORTED_MODULE_15__["HttpClientModule"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["MDBRootModule"]] }); })();
/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵsetClassMetadata"](AppModule, [{
        type: _angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"],
        args: [{
                declarations: [
                    _app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"],
                    _headers_headers_component__WEBPACK_IMPORTED_MODULE_4__["HeadersComponent"],
                    _headers_top_header_top_header_component__WEBPACK_IMPORTED_MODULE_5__["TopHeaderComponent"],
                    _headers_bottom_header_bottom_header_component__WEBPACK_IMPORTED_MODULE_6__["BottomHeaderComponent"],
                    _body_blocks_body_blocks_component__WEBPACK_IMPORTED_MODULE_7__["BodyBlocksComponent"],
                    _body_blocks_carousel_block_carousel_block_component__WEBPACK_IMPORTED_MODULE_9__["CarouselBlockComponent"],
                    _body_blocks_popular_collection_block_popular_collection_block_component__WEBPACK_IMPORTED_MODULE_10__["PopularCollectionBlockComponent"],
                    _body_blocks_new_arrivals_block_new_arrivals_block_component__WEBPACK_IMPORTED_MODULE_11__["NewArrivalsBlockComponent"],
                    _body_blocks_best_selling_block_best_selling_block_component__WEBPACK_IMPORTED_MODULE_12__["BestSellingBlockComponent"],
                    _body_blocks_contact_block_contact_block_component__WEBPACK_IMPORTED_MODULE_13__["ContactBlockComponent"]
                ],
                imports: [
                    _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                    _app_routing_module__WEBPACK_IMPORTED_MODULE_8__["AppRoutingModule"],
                    _angular_common_http__WEBPACK_IMPORTED_MODULE_15__["HttpClientModule"],
                    angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["MDBBootstrapModule"].forRoot()
                ],
                providers: [_services_home_loader_service__WEBPACK_IMPORTED_MODULE_14__["HomeLoaderService"]],
                bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"]]
            }]
    }], null, null); })();


/***/ }),

/***/ "./src/app/body-blocks/best-selling-block/best-selling-block.component.ts":
/*!********************************************************************************!*\
  !*** ./src/app/body-blocks/best-selling-block/best-selling-block.component.ts ***!
  \********************************************************************************/
/*! exports provided: BestSellingBlockComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BestSellingBlockComponent", function() { return BestSellingBlockComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var src_app_models_product_model__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! src/app/models/product.model */ "./src/app/models/product.model.ts");
/* harmony import */ var angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! angular-bootstrap-md */ "./node_modules/angular-bootstrap-md/__ivy_ngcc__/fesm2015/angular-bootstrap-md.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/__ivy_ngcc__/fesm2015/common.js");





function BestSellingBlockComponent_mdb_carousel_item_13_div_1_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div", 12);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "mdb-card", 13);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](2, "mdb-card-img", 14);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](3, "mdb-card-body", 15);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](4, "p", 16);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](5);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](6, "mdb-card-title");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](7, "h4", 17);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](8);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](9, "div", 18);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](10, "div", 19);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](11, "span", 20);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](12);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](13, "span", 21);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](14, "mdb-icon", 22);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](15, "button", 23);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](16, "Buy");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const card_r33 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("src", card_r33.imagePath);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](card_r33.categoryID);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](card_r33.productName);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](4);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate1"]("", card_r33.price, "$");
} }
function BestSellingBlockComponent_mdb_carousel_item_13_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "mdb-carousel-item", 10);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](1, BestSellingBlockComponent_mdb_carousel_item_13_div_1_Template, 17, 4, "div", 11);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const item_r30 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](1);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", item_r30);
} }
class BestSellingBlockComponent {
    constructor(renderer) {
        this.renderer = renderer;
        this.components = [];
        this.bestSellers = [];
        this.topProducts = [];
    }
    ngOnInit() {
        this.bestSellers.push(new src_app_models_product_model__WEBPACK_IMPORTED_MODULE_1__["Product"](1, 'assets/new_arrivals/p1.png', 'Custom Design Ring 24 carets gold', 'rings', 1000, '', '', '', ''));
        this.bestSellers.push(new src_app_models_product_model__WEBPACK_IMPORTED_MODULE_1__["Product"](2, 'assets/new_arrivals/p2.png', 'Double chain bracelet', 'chains', 100, '', '', '', ''));
        this.bestSellers.push(new src_app_models_product_model__WEBPACK_IMPORTED_MODULE_1__["Product"](3, 'assets/new_arrivals/p5.png', 'Gold plated bangle pair', 'bangles', 95, '', '', '', ''));
        this.bestSellers.push(new src_app_models_product_model__WEBPACK_IMPORTED_MODULE_1__["Product"](4, 'assets/popular_collections/p3.png', 'Diamond Pendent', 'pendents', 2300, '', '', '', ''));
        this.topProducts.push(new src_app_models_product_model__WEBPACK_IMPORTED_MODULE_1__["Product"](2, 'assets/new_arrivals/p2.png', 'Double chain bracelet', 'chains', 100, '', '', '', ''));
        this.topProducts.push(new src_app_models_product_model__WEBPACK_IMPORTED_MODULE_1__["Product"](3, 'assets/new_arrivals/p5.png', 'Gold plated bangle pair', 'bangles', 95, '', '', '', ''));
        this.topProducts.push(new src_app_models_product_model__WEBPACK_IMPORTED_MODULE_1__["Product"](1, 'assets/new_arrivals/p1.png', 'Custom Design Ring 24 carets gold', 'rings', 1000, '', '', '', ''));
        this.components.push(this.bestSellers);
        this.components.push(this.topProducts);
    }
    showTabs(tab) {
        const carouselTabs = document.getElementsByClassName('best-seller-carousel-item');
        const controlItems = document.getElementsByClassName('heading-control-item');
        if (tab === 1) {
            this.renderer.addClass(carouselTabs[0], 'active');
            this.renderer.removeClass(carouselTabs[1], 'active');
            this.renderer.addClass(controlItems[0], 'active');
            this.renderer.removeClass(controlItems[1], 'active');
        }
        else if (tab === 2) {
            this.renderer.addClass(carouselTabs[1], 'active');
            this.renderer.removeClass(carouselTabs[0], 'active');
            this.renderer.addClass(controlItems[1], 'active');
            this.renderer.removeClass(controlItems[0], 'active');
        }
    }
    ngAfterViewInit() {
        const columnDivs = document.getElementsByClassName('best-seller-column-items');
        if (this.bestSellers.length < 4) {
            for (let i = 0; i < this.bestSellers.length; i++) {
                this.renderer.removeClass(columnDivs[i], 'col-md-3');
                this.renderer.addClass(columnDivs[i], 'col-md-' + (12 / this.bestSellers.length));
            }
        }
        if (this.topProducts.length < 4) {
            for (let i = this.bestSellers.length; i < (this.bestSellers.length + this.topProducts.length); i++) {
                this.renderer.removeClass(columnDivs[i], 'col-md-3');
                this.renderer.addClass(columnDivs[i], 'col-md-' + (12 / this.topProducts.length));
            }
        }
    }
}
BestSellingBlockComponent.ɵfac = function BestSellingBlockComponent_Factory(t) { return new (t || BestSellingBlockComponent)(_angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdirectiveInject"](_angular_core__WEBPACK_IMPORTED_MODULE_0__["Renderer2"])); };
BestSellingBlockComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: BestSellingBlockComponent, selectors: [["app-best-selling-block"]], decls: 14, vars: 6, consts: [["data-wow-delay", "1s", "data-wow-duration", "1s", 1, "full-screen", "wow", "animate", "rotateInUpLeft"], [1, "container"], [1, "text-center"], [1, "best-section-heading"], ["src", "assets/line_star.png", 1, "line-stars"], [1, "carousel-multi-item", "multi-animation", "second-carousel", 3, "isControls", "type", "animation", "interval", "keyboard"], [1, "heading-controls"], [1, "heading-control-item", "active", 3, "click"], [1, "heading-control-item", 3, "click"], ["class", "best-seller-carousel-item", 4, "ngFor", "ngForOf"], [1, "best-seller-carousel-item"], ["class", "col-md-3 best-seller-column-items", 4, "ngFor", "ngForOf"], [1, "col-md-3", "best-seller-column-items"], [1, "my-1", "best-seller-card"], ["alt", "Card image cap", 1, "best-seller-img", "animate-color-left-right", 3, "src"], [1, "best-seller-card-body"], [1, "type-text"], [1, "card-title"], [1, "sub-items"], [1, "card-footer"], [1, "price", 2, "float", "left"], [1, "heart", "wish-list", 2, "float", "right"], ["far", "", "icon", "heart"], ["mdbBtn", "", "type", "button", "gradient", "peach", "rounded", "true", "mdbWavesEffect", "", 1, "buy-btn"]], template: function BestSellingBlockComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div", 0);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "div", 1);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "div", 2);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](3, "h3", 3);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](4, "OUR BESTSELLING ITEMS");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](5, "img", 4);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](6, "mdb-carousel", 5);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](7, "div", 6);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](8, "span", 7);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵlistener"]("click", function BestSellingBlockComponent_Template_span_click_8_listener() { return ctx.showTabs(1); });
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](9, "Top Products");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](10, "span", 8);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵlistener"]("click", function BestSellingBlockComponent_Template_span_click_10_listener() { return ctx.showTabs(2); });
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](11, "Best Sellers");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](12, "hr");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](13, BestSellingBlockComponent_mdb_carousel_item_13_Template, 2, 1, "mdb-carousel-item", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    } if (rf & 2) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](6);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("isControls", false)("type", "carousel-multi-item")("animation", "slide")("interval", 40000)("keyboard", true);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](7);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", ctx.components);
    } }, directives: [angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["CarouselComponent"], _angular_common__WEBPACK_IMPORTED_MODULE_3__["NgForOf"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["SlideComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["MdbCardComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["MdbCardImageComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["MdbCardBodyComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["MdbCardTitleComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["MdbIconComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["FarDirective"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["MdbBtnDirective"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["WavesDirective"]], styles: [".best-section-heading[_ngcontent-%COMP%] {\r\n    font-size: 20px;\r\n    margin-bottom: 5px;\r\n}\r\n\r\n.line-stars[_ngcontent-%COMP%] {\r\n    padding: 0px 0px 30px 0px;\r\n}\r\n\r\n.second-carousel[_ngcontent-%COMP%] {\r\n    text-align: center;\r\n}\r\n\r\nmdb-carousel-item[_ngcontent-%COMP%] {\r\n    height: 450px;\r\n}\r\n\r\n.best-seller-card[_ngcontent-%COMP%] {\r\n    margin: 20px 10px;\r\n    box-shadow: none;\r\n    height: 320px;\r\n    transition: height 0.5s;\r\n}\r\n\r\n.best-seller-card-body[_ngcontent-%COMP%] {\r\n    text-align: center;\r\n}\r\n\r\n.animate-color-left-right[_ngcontent-%COMP%] {\r\n    box-shadow: none;\r\n    width: 100%;\r\n    padding: 15px;\r\n    background: linear-gradient(45deg, beige 35%, #e2e2e2b8 30%);\r\n    background-size: 200% 100%;\r\n    background-position: right bottom;\r\n    transition: all 1s ease;\r\n}\r\n\r\n.animate-color-left-right[_ngcontent-%COMP%]:hover {\r\n    background-position: left bottom;\r\n    transform: scale(1.05);\r\n    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.28), 0 2px 10px 0 rgba(0, 0, 0, 0.39);\r\n}\r\n\r\n.card-title[_ngcontent-%COMP%] {\r\n    padding: 0;\r\n    font-size: 22px;\r\n    font-family: none;\r\n    margin: 0;\r\n    cursor: pointer;\r\n    height: 70px;\r\n}\r\n\r\n.type-text[_ngcontent-%COMP%] {\r\n    color: #b9b9b9 !important;\r\n    text-shadow: 1px 1px 1px black, 1px 1px 1px black;\r\n    cursor: pointer;\r\n    font-family: 'Josefin Sans', sans-serif;\r\n    margin: 0;\r\n}\r\n\r\n.type-text[_ngcontent-%COMP%]   h5[_ngcontent-%COMP%] {\r\n    font-size: 12px;\r\n}\r\n\r\n.sub-items[_ngcontent-%COMP%] {\r\n    width: 100%;\r\n    background: white;\r\n    z-index: 1;\r\n    display: none;\r\n    -webkit-animation: slow-disp 2s;\r\n            animation: slow-disp 2s;\r\n}\r\n\r\n.card-footer[_ngcontent-%COMP%] {\r\n    background: none;\r\n    padding-bottom: 30px;\r\n    font-family: 'Josefin Sans', sans-serif;\r\n}\r\n\r\n.buy-btn[_ngcontent-%COMP%] {\r\n    margin: 0 auto;\r\n    margin-top: 15px;\r\n    padding: 10px 40px;\r\n    display: none;\r\n    -webkit-animation: slow-disp 2s;\r\n            animation: slow-disp 2s;\r\n}\r\n\r\n.card-footer[_ngcontent-%COMP%]   .heart[_ngcontent-%COMP%]:hover {\r\n    cursor: pointer;\r\n}\r\n\r\n.best-seller-card[_ngcontent-%COMP%]:hover {\r\n    height: 430px;\r\n    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px 0 rgba(0, 0, 0, .12);\r\n}\r\n\r\n.best-seller-card[_ngcontent-%COMP%]:hover   .animate-color-left-right[_ngcontent-%COMP%] {\r\n    background-color: #c3c3c3;\r\n}\r\n\r\n.best-seller-card[_ngcontent-%COMP%]:hover   .buy-btn[_ngcontent-%COMP%], .best-seller-card[_ngcontent-%COMP%]:hover   .sub-items[_ngcontent-%COMP%] {\r\n    display: block;\r\n    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px 0 rgba(0, 0, 0, .12);\r\n}\r\n\r\n.heading-controls[_ngcontent-%COMP%] {\r\n    padding-top: 10px;\r\n}\r\n\r\n.heading-control-item[_ngcontent-%COMP%] {\r\n    font-family: \"Font Awesome 5 Free\";\r\n    font-weight: 900;\r\n    padding: 10px 35px;\r\n    border-radius: 35px;\r\n    margin-right: 10px;\r\n    cursor: pointer;\r\n}\r\n\r\n.heading-controls[_ngcontent-%COMP%]   .active[_ngcontent-%COMP%] {\r\n    background: beige;\r\n    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px 0 rgba(0, 0, 0, .12);\r\n}\r\n\r\n.heading-control-item[_ngcontent-%COMP%]:hover {\r\n    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px 0 rgba(0, 0, 0, .12);\r\n}\r\n\r\n@media only screen and (max-width: 1200px) and (min-width: 990px) {\r\n    .card-title[_ngcontent-%COMP%] {\r\n        font-size: 16px;\r\n    }\r\n}\r\n\r\n@media only screen and (max-width: 990px) and (min-width: 790px) {\r\n    mdb-carousel-item[_ngcontent-%COMP%] {\r\n        width: 930px;\r\n    }\r\n    .card-title[_ngcontent-%COMP%] {\r\n        font-size: 16px;\r\n    }\r\n}\r\n\r\n@media only screen and (max-width: 790px) {\r\n    mdb-carousel-item[_ngcontent-%COMP%] {\r\n        width: 1050px;\r\n    }\r\n    .card-title[_ngcontent-%COMP%] {\r\n        font-size: 16px;\r\n    }\r\n}\r\n\r\n@-webkit-keyframes slow-disp {\r\n    0% {\r\n        opacity: 0;\r\n    }\r\n    100% {\r\n        opacity: 1;\r\n    }\r\n}\r\n\r\n@keyframes slow-disp {\r\n    0% {\r\n        opacity: 0;\r\n    }\r\n    100% {\r\n        opacity: 1;\r\n    }\r\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvYm9keS1ibG9ja3MvYmVzdC1zZWxsaW5nLWJsb2NrL2Jlc3Qtc2VsbGluZy1ibG9jay5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0lBQ0ksZUFBZTtJQUNmLGtCQUFrQjtBQUN0Qjs7QUFFQTtJQUNJLHlCQUF5QjtBQUM3Qjs7QUFFQTtJQUNJLGtCQUFrQjtBQUN0Qjs7QUFFQTtJQUNJLGFBQWE7QUFDakI7O0FBRUE7SUFDSSxpQkFBaUI7SUFDakIsZ0JBQWdCO0lBQ2hCLGFBQWE7SUFDYix1QkFBdUI7QUFDM0I7O0FBRUE7SUFDSSxrQkFBa0I7QUFDdEI7O0FBRUE7SUFDSSxnQkFBZ0I7SUFDaEIsV0FBVztJQUNYLGFBQWE7SUFDYiw0REFBNEQ7SUFDNUQsMEJBQTBCO0lBQzFCLGlDQUFpQztJQUNqQyx1QkFBdUI7QUFDM0I7O0FBRUE7SUFDSSxnQ0FBZ0M7SUFDaEMsc0JBQXNCO0lBQ3RCLDZFQUE2RTtBQUNqRjs7QUFFQTtJQUNJLFVBQVU7SUFDVixlQUFlO0lBQ2YsaUJBQWlCO0lBQ2pCLFNBQVM7SUFDVCxlQUFlO0lBQ2YsWUFBWTtBQUNoQjs7QUFFQTtJQUNJLHlCQUF5QjtJQUN6QixpREFBaUQ7SUFDakQsZUFBZTtJQUNmLHVDQUF1QztJQUN2QyxTQUFTO0FBQ2I7O0FBRUE7SUFDSSxlQUFlO0FBQ25COztBQUVBO0lBQ0ksV0FBVztJQUNYLGlCQUFpQjtJQUNqQixVQUFVO0lBQ1YsYUFBYTtJQUNiLCtCQUF1QjtZQUF2Qix1QkFBdUI7QUFDM0I7O0FBRUE7SUFDSSxnQkFBZ0I7SUFDaEIsb0JBQW9CO0lBQ3BCLHVDQUF1QztBQUMzQzs7QUFFQTtJQUNJLGNBQWM7SUFDZCxnQkFBZ0I7SUFDaEIsa0JBQWtCO0lBQ2xCLGFBQWE7SUFDYiwrQkFBdUI7WUFBdkIsdUJBQXVCO0FBQzNCOztBQUVBO0lBQ0ksZUFBZTtBQUNuQjs7QUFFQTtJQUNJLGFBQWE7SUFDYiwyRUFBMkU7QUFDL0U7O0FBRUE7SUFDSSx5QkFBeUI7QUFDN0I7O0FBRUE7O0lBRUksY0FBYztJQUNkLDJFQUEyRTtBQUMvRTs7QUFFQTtJQUNJLGlCQUFpQjtBQUNyQjs7QUFFQTtJQUNJLGtDQUFrQztJQUNsQyxnQkFBZ0I7SUFDaEIsa0JBQWtCO0lBQ2xCLG1CQUFtQjtJQUNuQixrQkFBa0I7SUFDbEIsZUFBZTtBQUNuQjs7QUFFQTtJQUNJLGlCQUFpQjtJQUNqQiwyRUFBMkU7QUFDL0U7O0FBRUE7SUFDSSwyRUFBMkU7QUFDL0U7O0FBRUE7SUFDSTtRQUNJLGVBQWU7SUFDbkI7QUFDSjs7QUFFQTtJQUNJO1FBQ0ksWUFBWTtJQUNoQjtJQUNBO1FBQ0ksZUFBZTtJQUNuQjtBQUNKOztBQUVBO0lBQ0k7UUFDSSxhQUFhO0lBQ2pCO0lBQ0E7UUFDSSxlQUFlO0lBQ25CO0FBQ0o7O0FBRUE7SUFDSTtRQUNJLFVBQVU7SUFDZDtJQUNBO1FBQ0ksVUFBVTtJQUNkO0FBQ0o7O0FBUEE7SUFDSTtRQUNJLFVBQVU7SUFDZDtJQUNBO1FBQ0ksVUFBVTtJQUNkO0FBQ0oiLCJmaWxlIjoic3JjL2FwcC9ib2R5LWJsb2Nrcy9iZXN0LXNlbGxpbmctYmxvY2svYmVzdC1zZWxsaW5nLWJsb2NrLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIuYmVzdC1zZWN0aW9uLWhlYWRpbmcge1xyXG4gICAgZm9udC1zaXplOiAyMHB4O1xyXG4gICAgbWFyZ2luLWJvdHRvbTogNXB4O1xyXG59XHJcblxyXG4ubGluZS1zdGFycyB7XHJcbiAgICBwYWRkaW5nOiAwcHggMHB4IDMwcHggMHB4O1xyXG59XHJcblxyXG4uc2Vjb25kLWNhcm91c2VsIHtcclxuICAgIHRleHQtYWxpZ246IGNlbnRlcjtcclxufVxyXG5cclxubWRiLWNhcm91c2VsLWl0ZW0ge1xyXG4gICAgaGVpZ2h0OiA0NTBweDtcclxufVxyXG5cclxuLmJlc3Qtc2VsbGVyLWNhcmQge1xyXG4gICAgbWFyZ2luOiAyMHB4IDEwcHg7XHJcbiAgICBib3gtc2hhZG93OiBub25lO1xyXG4gICAgaGVpZ2h0OiAzMjBweDtcclxuICAgIHRyYW5zaXRpb246IGhlaWdodCAwLjVzO1xyXG59XHJcblxyXG4uYmVzdC1zZWxsZXItY2FyZC1ib2R5IHtcclxuICAgIHRleHQtYWxpZ246IGNlbnRlcjtcclxufVxyXG5cclxuLmFuaW1hdGUtY29sb3ItbGVmdC1yaWdodCB7XHJcbiAgICBib3gtc2hhZG93OiBub25lO1xyXG4gICAgd2lkdGg6IDEwMCU7XHJcbiAgICBwYWRkaW5nOiAxNXB4O1xyXG4gICAgYmFja2dyb3VuZDogbGluZWFyLWdyYWRpZW50KDQ1ZGVnLCBiZWlnZSAzNSUsICNlMmUyZTJiOCAzMCUpO1xyXG4gICAgYmFja2dyb3VuZC1zaXplOiAyMDAlIDEwMCU7XHJcbiAgICBiYWNrZ3JvdW5kLXBvc2l0aW9uOiByaWdodCBib3R0b207XHJcbiAgICB0cmFuc2l0aW9uOiBhbGwgMXMgZWFzZTtcclxufVxyXG5cclxuLmFuaW1hdGUtY29sb3ItbGVmdC1yaWdodDpob3ZlciB7XHJcbiAgICBiYWNrZ3JvdW5kLXBvc2l0aW9uOiBsZWZ0IGJvdHRvbTtcclxuICAgIHRyYW5zZm9ybTogc2NhbGUoMS4wNSk7XHJcbiAgICBib3gtc2hhZG93OiAwIDJweCA1cHggMCByZ2JhKDAsIDAsIDAsIDAuMjgpLCAwIDJweCAxMHB4IDAgcmdiYSgwLCAwLCAwLCAwLjM5KTtcclxufVxyXG5cclxuLmNhcmQtdGl0bGUge1xyXG4gICAgcGFkZGluZzogMDtcclxuICAgIGZvbnQtc2l6ZTogMjJweDtcclxuICAgIGZvbnQtZmFtaWx5OiBub25lO1xyXG4gICAgbWFyZ2luOiAwO1xyXG4gICAgY3Vyc29yOiBwb2ludGVyO1xyXG4gICAgaGVpZ2h0OiA3MHB4O1xyXG59XHJcblxyXG4udHlwZS10ZXh0IHtcclxuICAgIGNvbG9yOiAjYjliOWI5ICFpbXBvcnRhbnQ7XHJcbiAgICB0ZXh0LXNoYWRvdzogMXB4IDFweCAxcHggYmxhY2ssIDFweCAxcHggMXB4IGJsYWNrO1xyXG4gICAgY3Vyc29yOiBwb2ludGVyO1xyXG4gICAgZm9udC1mYW1pbHk6ICdKb3NlZmluIFNhbnMnLCBzYW5zLXNlcmlmO1xyXG4gICAgbWFyZ2luOiAwO1xyXG59XHJcblxyXG4udHlwZS10ZXh0IGg1IHtcclxuICAgIGZvbnQtc2l6ZTogMTJweDtcclxufVxyXG5cclxuLnN1Yi1pdGVtcyB7XHJcbiAgICB3aWR0aDogMTAwJTtcclxuICAgIGJhY2tncm91bmQ6IHdoaXRlO1xyXG4gICAgei1pbmRleDogMTtcclxuICAgIGRpc3BsYXk6IG5vbmU7XHJcbiAgICBhbmltYXRpb246IHNsb3ctZGlzcCAycztcclxufVxyXG5cclxuLmNhcmQtZm9vdGVyIHtcclxuICAgIGJhY2tncm91bmQ6IG5vbmU7XHJcbiAgICBwYWRkaW5nLWJvdHRvbTogMzBweDtcclxuICAgIGZvbnQtZmFtaWx5OiAnSm9zZWZpbiBTYW5zJywgc2Fucy1zZXJpZjtcclxufVxyXG5cclxuLmJ1eS1idG4ge1xyXG4gICAgbWFyZ2luOiAwIGF1dG87XHJcbiAgICBtYXJnaW4tdG9wOiAxNXB4O1xyXG4gICAgcGFkZGluZzogMTBweCA0MHB4O1xyXG4gICAgZGlzcGxheTogbm9uZTtcclxuICAgIGFuaW1hdGlvbjogc2xvdy1kaXNwIDJzO1xyXG59XHJcblxyXG4uY2FyZC1mb290ZXIgLmhlYXJ0OmhvdmVyIHtcclxuICAgIGN1cnNvcjogcG9pbnRlcjtcclxufVxyXG5cclxuLmJlc3Qtc2VsbGVyLWNhcmQ6aG92ZXIge1xyXG4gICAgaGVpZ2h0OiA0MzBweDtcclxuICAgIGJveC1zaGFkb3c6IDAgMnB4IDVweCAwIHJnYmEoMCwgMCwgMCwgLjE2KSwgMCAycHggMTBweCAwIHJnYmEoMCwgMCwgMCwgLjEyKTtcclxufVxyXG5cclxuLmJlc3Qtc2VsbGVyLWNhcmQ6aG92ZXIgLmFuaW1hdGUtY29sb3ItbGVmdC1yaWdodCB7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiAjYzNjM2MzO1xyXG59XHJcblxyXG4uYmVzdC1zZWxsZXItY2FyZDpob3ZlciAuYnV5LWJ0bixcclxuLmJlc3Qtc2VsbGVyLWNhcmQ6aG92ZXIgLnN1Yi1pdGVtcyB7XHJcbiAgICBkaXNwbGF5OiBibG9jaztcclxuICAgIGJveC1zaGFkb3c6IDAgMnB4IDVweCAwIHJnYmEoMCwgMCwgMCwgLjE2KSwgMCAycHggMTBweCAwIHJnYmEoMCwgMCwgMCwgLjEyKTtcclxufVxyXG5cclxuLmhlYWRpbmctY29udHJvbHMge1xyXG4gICAgcGFkZGluZy10b3A6IDEwcHg7XHJcbn1cclxuXHJcbi5oZWFkaW5nLWNvbnRyb2wtaXRlbSB7XHJcbiAgICBmb250LWZhbWlseTogXCJGb250IEF3ZXNvbWUgNSBGcmVlXCI7XHJcbiAgICBmb250LXdlaWdodDogOTAwO1xyXG4gICAgcGFkZGluZzogMTBweCAzNXB4O1xyXG4gICAgYm9yZGVyLXJhZGl1czogMzVweDtcclxuICAgIG1hcmdpbi1yaWdodDogMTBweDtcclxuICAgIGN1cnNvcjogcG9pbnRlcjtcclxufVxyXG5cclxuLmhlYWRpbmctY29udHJvbHMgLmFjdGl2ZSB7XHJcbiAgICBiYWNrZ3JvdW5kOiBiZWlnZTtcclxuICAgIGJveC1zaGFkb3c6IDAgMnB4IDVweCAwIHJnYmEoMCwgMCwgMCwgLjE2KSwgMCAycHggMTBweCAwIHJnYmEoMCwgMCwgMCwgLjEyKTtcclxufVxyXG5cclxuLmhlYWRpbmctY29udHJvbC1pdGVtOmhvdmVyIHtcclxuICAgIGJveC1zaGFkb3c6IDAgMnB4IDVweCAwIHJnYmEoMCwgMCwgMCwgLjE2KSwgMCAycHggMTBweCAwIHJnYmEoMCwgMCwgMCwgLjEyKTtcclxufVxyXG5cclxuQG1lZGlhIG9ubHkgc2NyZWVuIGFuZCAobWF4LXdpZHRoOiAxMjAwcHgpIGFuZCAobWluLXdpZHRoOiA5OTBweCkge1xyXG4gICAgLmNhcmQtdGl0bGUge1xyXG4gICAgICAgIGZvbnQtc2l6ZTogMTZweDtcclxuICAgIH1cclxufVxyXG5cclxuQG1lZGlhIG9ubHkgc2NyZWVuIGFuZCAobWF4LXdpZHRoOiA5OTBweCkgYW5kIChtaW4td2lkdGg6IDc5MHB4KSB7XHJcbiAgICBtZGItY2Fyb3VzZWwtaXRlbSB7XHJcbiAgICAgICAgd2lkdGg6IDkzMHB4O1xyXG4gICAgfVxyXG4gICAgLmNhcmQtdGl0bGUge1xyXG4gICAgICAgIGZvbnQtc2l6ZTogMTZweDtcclxuICAgIH1cclxufVxyXG5cclxuQG1lZGlhIG9ubHkgc2NyZWVuIGFuZCAobWF4LXdpZHRoOiA3OTBweCkge1xyXG4gICAgbWRiLWNhcm91c2VsLWl0ZW0ge1xyXG4gICAgICAgIHdpZHRoOiAxMDUwcHg7XHJcbiAgICB9XHJcbiAgICAuY2FyZC10aXRsZSB7XHJcbiAgICAgICAgZm9udC1zaXplOiAxNnB4O1xyXG4gICAgfVxyXG59XHJcblxyXG5Aa2V5ZnJhbWVzIHNsb3ctZGlzcCB7XHJcbiAgICAwJSB7XHJcbiAgICAgICAgb3BhY2l0eTogMDtcclxuICAgIH1cclxuICAgIDEwMCUge1xyXG4gICAgICAgIG9wYWNpdHk6IDE7XHJcbiAgICB9XHJcbn0iXX0= */"] });
/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵsetClassMetadata"](BestSellingBlockComponent, [{
        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"],
        args: [{
                selector: 'app-best-selling-block',
                templateUrl: './best-selling-block.component.html',
                styleUrls: ['./best-selling-block.component.css']
            }]
    }], function () { return [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Renderer2"] }]; }, null); })();


/***/ }),

/***/ "./src/app/body-blocks/body-blocks.component.ts":
/*!******************************************************!*\
  !*** ./src/app/body-blocks/body-blocks.component.ts ***!
  \******************************************************/
/*! exports provided: BodyBlocksComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BodyBlocksComponent", function() { return BodyBlocksComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var _services_home_loader_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../services/home-loader.service */ "./src/app/services/home-loader.service.ts");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/__ivy_ngcc__/fesm2015/common.js");
/* harmony import */ var _best_selling_block_best_selling_block_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./best-selling-block/best-selling-block.component */ "./src/app/body-blocks/best-selling-block/best-selling-block.component.ts");
/* harmony import */ var _contact_block_contact_block_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./contact-block/contact-block.component */ "./src/app/body-blocks/contact-block/contact-block.component.ts");
/* harmony import */ var _carousel_block_carousel_block_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./carousel-block/carousel-block.component */ "./src/app/body-blocks/carousel-block/carousel-block.component.ts");
/* harmony import */ var _popular_collection_block_popular_collection_block_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./popular-collection-block/popular-collection-block.component */ "./src/app/body-blocks/popular-collection-block/popular-collection-block.component.ts");
/* harmony import */ var _new_arrivals_block_new_arrivals_block_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./new-arrivals-block/new-arrivals-block.component */ "./src/app/body-blocks/new-arrivals-block/new-arrivals-block.component.ts");









function BodyBlocksComponent_app_carousel_block_0_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](0, "app-carousel-block", 3);
} if (rf & 2) {
    const ctx_r18 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵnextContext"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("carouselImages", ctx_r18.carouselImages);
} }
function BodyBlocksComponent_app_popular_collection_block_1_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](0, "app-popular-collection-block", 4);
} if (rf & 2) {
    const ctx_r19 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵnextContext"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("popularCollections", ctx_r19.categoryModels);
} }
function BodyBlocksComponent_app_new_arrivals_block_2_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](0, "app-new-arrivals-block", 5);
} if (rf & 2) {
    const ctx_r20 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵnextContext"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("newArrivals", ctx_r20.newArrivals);
} }
class BodyBlocksComponent {
    constructor(homeLoaderService) {
        this.homeLoaderService = homeLoaderService;
        this.carouselImages = [];
        this.carouselImagesLoaded = false;
        this.categoryModels = [];
        this.categoryModelsLoaded = false;
        this.newArrivals = [];
        this.newArrivalsLoaded = false;
    }
    ngOnInit() {
        this.homeLoaderService.fetchCarouselImages();
        this.homeLoaderService.carouselImagesObserver.subscribe((carouselImagesLoaded) => {
            this.carouselImages = this.homeLoaderService.getCarouselImages();
            this.carouselImagesLoaded = carouselImagesLoaded;
        });
        this.homeLoaderService.fetchCategoryModels();
        this.homeLoaderService.categoryModelsObserver.subscribe((categoryModelsLoaded) => {
            this.categoryModels = this.homeLoaderService.getCategoryModels();
            this.categoryModelsLoaded = categoryModelsLoaded;
        });
        this.homeLoaderService.fetchNewArrivals();
        this.homeLoaderService.newArrivalsObserver.subscribe((newArrivalsLoaded) => {
            this.newArrivals = this.homeLoaderService.getNewArrivals();
            this.newArrivalsLoaded = newArrivalsLoaded;
        });
    }
}
BodyBlocksComponent.ɵfac = function BodyBlocksComponent_Factory(t) { return new (t || BodyBlocksComponent)(_angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdirectiveInject"](_services_home_loader_service__WEBPACK_IMPORTED_MODULE_1__["HomeLoaderService"])); };
BodyBlocksComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: BodyBlocksComponent, selectors: [["app-body-blocks"]], decls: 5, vars: 3, consts: [[3, "carouselImages", 4, "ngIf"], [3, "popularCollections", 4, "ngIf"], [3, "newArrivals", 4, "ngIf"], [3, "carouselImages"], [3, "popularCollections"], [3, "newArrivals"]], template: function BodyBlocksComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](0, BodyBlocksComponent_app_carousel_block_0_Template, 1, 1, "app-carousel-block", 0);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](1, BodyBlocksComponent_app_popular_collection_block_1_Template, 1, 1, "app-popular-collection-block", 1);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](2, BodyBlocksComponent_app_new_arrivals_block_2_Template, 1, 1, "app-new-arrivals-block", 2);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](3, "app-best-selling-block");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](4, "app-contact-block");
    } if (rf & 2) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngIf", ctx.carouselImagesLoaded);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](1);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngIf", ctx.categoryModelsLoaded);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](1);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngIf", ctx.newArrivalsLoaded);
    } }, directives: [_angular_common__WEBPACK_IMPORTED_MODULE_2__["NgIf"], _best_selling_block_best_selling_block_component__WEBPACK_IMPORTED_MODULE_3__["BestSellingBlockComponent"], _contact_block_contact_block_component__WEBPACK_IMPORTED_MODULE_4__["ContactBlockComponent"], _carousel_block_carousel_block_component__WEBPACK_IMPORTED_MODULE_5__["CarouselBlockComponent"], _popular_collection_block_popular_collection_block_component__WEBPACK_IMPORTED_MODULE_6__["PopularCollectionBlockComponent"], _new_arrivals_block_new_arrivals_block_component__WEBPACK_IMPORTED_MODULE_7__["NewArrivalsBlockComponent"]], styles: ["\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2JvZHktYmxvY2tzL2JvZHktYmxvY2tzLmNvbXBvbmVudC5jc3MifQ== */"] });
/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵsetClassMetadata"](BodyBlocksComponent, [{
        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"],
        args: [{
                selector: 'app-body-blocks',
                templateUrl: './body-blocks.component.html',
                styleUrls: ['./body-blocks.component.css']
            }]
    }], function () { return [{ type: _services_home_loader_service__WEBPACK_IMPORTED_MODULE_1__["HomeLoaderService"] }]; }, null); })();


/***/ }),

/***/ "./src/app/body-blocks/carousel-block/carousel-block.component.ts":
/*!************************************************************************!*\
  !*** ./src/app/body-blocks/carousel-block/carousel-block.component.ts ***!
  \************************************************************************/
/*! exports provided: CarouselBlockComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CarouselBlockComponent", function() { return CarouselBlockComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var src_app_models_carousel_image_model__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! src/app/models/carousel_image.model */ "./src/app/models/carousel_image.model.ts");
/* harmony import */ var angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! angular-bootstrap-md */ "./node_modules/angular-bootstrap-md/__ivy_ngcc__/fesm2015/angular-bootstrap-md.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/__ivy_ngcc__/fesm2015/common.js");





const _c0 = function (a0, a1, a2) { return { "slideInLeft carousel-caption-left": a0, "slideInRight carousel-caption-right": a1, "slideInUp carousel-caption-center": a2 }; };
function CarouselBlockComponent_mdb_carousel_item_1_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "mdb-carousel-item");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "div", 2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](2, "img", 3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](3, "div", 4);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](4, "div", 5);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](5, "h3", 6);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](6);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](7, "p", 7);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](8);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const item_r22 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("src", item_r22.imageUrl, _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵsanitizeUrl"]);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngClass", _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵpureFunction3"](4, _c0, item_r22.imageOrientation == "RIGHT", item_r22.imageOrientation == "LEFT", item_r22.imageOrientation == "UP"));
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](item_r22.imageDescription);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](item_r22.secondSentence);
} }
class CarouselBlockComponent {
    constructor() {
    }
    ngOnInit() {
        if (this.carouselImages.length == 0) {
            this.carouselImages.push(new src_app_models_carousel_image_model__WEBPACK_IMPORTED_MODULE_1__["CarouselImage"](1, 'assets/carousel_1.jpg', 'A special gift, for a special women', 'Necklace', 'LEFT'));
            this.carouselImages.push(new src_app_models_carousel_image_model__WEBPACK_IMPORTED_MODULE_1__["CarouselImage"](2, 'assets/carousel_2.jpg', 'Crafted specially for you', 'Bangles', 'LEFT'));
            this.carouselImages.push(new src_app_models_carousel_image_model__WEBPACK_IMPORTED_MODULE_1__["CarouselImage"](3, 'assets/carousel_3.jpg', 'Gift someone', 'Rings', 'RIGHT'));
        }
    }
}
CarouselBlockComponent.ɵfac = function CarouselBlockComponent_Factory(t) { return new (t || CarouselBlockComponent)(); };
CarouselBlockComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: CarouselBlockComponent, selectors: [["app-carousel-block"]], inputs: { carouselImages: "carouselImages" }, decls: 2, vars: 2, consts: [[1, "carousel", "slide", "carousel-fade", "main-carousel", 3, "animation"], [4, "ngFor", "ngForOf"], [1, "view", "w-100"], ["alt", "First slide", 1, "d-block", "w-100", "carousel-img", 3, "src"], ["mdbWavesEffect", "", 1, "mask", "rgba-black-light", "waves-light"], [1, "carousel-caption", "wow", "animate", 3, "ngClass"], [1, "h3-responsive"], [1, "sub-para"]], template: function CarouselBlockComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "mdb-carousel", 0);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](1, CarouselBlockComponent_mdb_carousel_item_1_Template, 9, 8, "mdb-carousel-item", 1);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    } if (rf & 2) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("animation", "fade");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](1);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", ctx.carouselImages);
    } }, directives: [angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["CarouselComponent"], _angular_common__WEBPACK_IMPORTED_MODULE_3__["NgForOf"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["SlideComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["WavesDirective"], _angular_common__WEBPACK_IMPORTED_MODULE_3__["NgClass"]], styles: [".carousel-img[_ngcontent-%COMP%] {\r\n    height: 500px !important;\r\n}\r\n\r\n.carousel-caption-center[_ngcontent-%COMP%] {\r\n    bottom: 10px !important;\r\n}\r\n\r\n.carousel-caption-left[_ngcontent-%COMP%] {\r\n    left: 15% !important;\r\n    right: unset !important;\r\n    bottom: 40% !important;\r\n}\r\n\r\n.carousel-caption-right[_ngcontent-%COMP%] {\r\n    right: 15% !important;\r\n    left: unset !important;\r\n    bottom: 40% !important;\r\n}\r\n\r\n.h3-responsive[_ngcontent-%COMP%] {\r\n    font-family: 'Italianno', cursive;\r\n    font-size: 2.5rem;\r\n    color: #000000;\r\n    text-shadow: 0 0 13px #585858, 0 0 20px #1a1a1a;\r\n    font-weight: 600;\r\n    letter-spacing: 2px;\r\n}\r\n\r\n.sub-para[_ngcontent-%COMP%] {\r\n    font-family: 'Tangerine', cursive;\r\n    font-size: 25px;\r\n    color: #ffffff;\r\n    text-shadow: 0 0 5px #000000, 0 0 5px #565656;\r\n    letter-spacing: 2px;\r\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvYm9keS1ibG9ja3MvY2Fyb3VzZWwtYmxvY2svY2Fyb3VzZWwtYmxvY2suY29tcG9uZW50LmNzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtJQUNJLHdCQUF3QjtBQUM1Qjs7QUFFQTtJQUNJLHVCQUF1QjtBQUMzQjs7QUFFQTtJQUNJLG9CQUFvQjtJQUNwQix1QkFBdUI7SUFDdkIsc0JBQXNCO0FBQzFCOztBQUVBO0lBQ0kscUJBQXFCO0lBQ3JCLHNCQUFzQjtJQUN0QixzQkFBc0I7QUFDMUI7O0FBRUE7SUFDSSxpQ0FBaUM7SUFDakMsaUJBQWlCO0lBQ2pCLGNBQWM7SUFDZCwrQ0FBK0M7SUFDL0MsZ0JBQWdCO0lBQ2hCLG1CQUFtQjtBQUN2Qjs7QUFFQTtJQUNJLGlDQUFpQztJQUNqQyxlQUFlO0lBQ2YsY0FBYztJQUNkLDZDQUE2QztJQUM3QyxtQkFBbUI7QUFDdkIiLCJmaWxlIjoic3JjL2FwcC9ib2R5LWJsb2Nrcy9jYXJvdXNlbC1ibG9jay9jYXJvdXNlbC1ibG9jay5jb21wb25lbnQuY3NzIiwic291cmNlc0NvbnRlbnQiOlsiLmNhcm91c2VsLWltZyB7XHJcbiAgICBoZWlnaHQ6IDUwMHB4ICFpbXBvcnRhbnQ7XHJcbn1cclxuXHJcbi5jYXJvdXNlbC1jYXB0aW9uLWNlbnRlciB7XHJcbiAgICBib3R0b206IDEwcHggIWltcG9ydGFudDtcclxufVxyXG5cclxuLmNhcm91c2VsLWNhcHRpb24tbGVmdCB7XHJcbiAgICBsZWZ0OiAxNSUgIWltcG9ydGFudDtcclxuICAgIHJpZ2h0OiB1bnNldCAhaW1wb3J0YW50O1xyXG4gICAgYm90dG9tOiA0MCUgIWltcG9ydGFudDtcclxufVxyXG5cclxuLmNhcm91c2VsLWNhcHRpb24tcmlnaHQge1xyXG4gICAgcmlnaHQ6IDE1JSAhaW1wb3J0YW50O1xyXG4gICAgbGVmdDogdW5zZXQgIWltcG9ydGFudDtcclxuICAgIGJvdHRvbTogNDAlICFpbXBvcnRhbnQ7XHJcbn1cclxuXHJcbi5oMy1yZXNwb25zaXZlIHtcclxuICAgIGZvbnQtZmFtaWx5OiAnSXRhbGlhbm5vJywgY3Vyc2l2ZTtcclxuICAgIGZvbnQtc2l6ZTogMi41cmVtO1xyXG4gICAgY29sb3I6ICMwMDAwMDA7XHJcbiAgICB0ZXh0LXNoYWRvdzogMCAwIDEzcHggIzU4NTg1OCwgMCAwIDIwcHggIzFhMWExYTtcclxuICAgIGZvbnQtd2VpZ2h0OiA2MDA7XHJcbiAgICBsZXR0ZXItc3BhY2luZzogMnB4O1xyXG59XHJcblxyXG4uc3ViLXBhcmEge1xyXG4gICAgZm9udC1mYW1pbHk6ICdUYW5nZXJpbmUnLCBjdXJzaXZlO1xyXG4gICAgZm9udC1zaXplOiAyNXB4O1xyXG4gICAgY29sb3I6ICNmZmZmZmY7XHJcbiAgICB0ZXh0LXNoYWRvdzogMCAwIDVweCAjMDAwMDAwLCAwIDAgNXB4ICM1NjU2NTY7XHJcbiAgICBsZXR0ZXItc3BhY2luZzogMnB4O1xyXG59Il19 */"] });
/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵsetClassMetadata"](CarouselBlockComponent, [{
        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"],
        args: [{
                selector: 'app-carousel-block',
                templateUrl: './carousel-block.component.html',
                styleUrls: ['./carousel-block.component.css']
            }]
    }], function () { return []; }, { carouselImages: [{
            type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"]
        }] }); })();


/***/ }),

/***/ "./src/app/body-blocks/contact-block/contact-block.component.ts":
/*!**********************************************************************!*\
  !*** ./src/app/body-blocks/contact-block/contact-block.component.ts ***!
  \**********************************************************************/
/*! exports provided: ContactBlockComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ContactBlockComponent", function() { return ContactBlockComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! angular-bootstrap-md */ "./node_modules/angular-bootstrap-md/__ivy_ngcc__/fesm2015/angular-bootstrap-md.js");



class ContactBlockComponent {
    constructor() {
    }
    ngOnInit() {
    }
}
ContactBlockComponent.ɵfac = function ContactBlockComponent_Factory(t) { return new (t || ContactBlockComponent)(); };
ContactBlockComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: ContactBlockComponent, selectors: [["app-contact-block"]], decls: 78, vars: 0, consts: [[1, "container-fluid", "contact-container"], [1, "page-footer", "font-small", "mdb-color", "pt-4"], [1, "container", "text-center", "text-md-left"], [1, "row", "text-center", "text-md-left", "mt-3", "pb-3"], [1, "col-md-3", "col-lg-3", "col-xl-3", "mx-auto", "mt-3"], [1, "text-uppercase", "mb-4", "font-weight-bold", "company-header"], [1, "w-100", "clearfix", "d-md-none"], [1, "col-md-2", "col-lg-2", "col-xl-2", "mx-auto", "mt-3"], [1, "text-uppercase", "mb-4", "font-weight-bold"], ["href", ""], ["href", "#!"], [1, "col-md-4", "col-lg-3", "col-xl-3", "mx-auto", "mt-3"], ["fas", "", "icon", "phone", 1, "mr-3"], ["href", "tel:+1-303-499-7111", 1, "tel"], [1, "add-div"], ["fas", "", "icon", "envelope", 1, "mr-3"], ["href", "mailto:info@example.com", 1, "email"], ["fas", "", "icon", "home", 1, "mr-3"], [1, "contact-div"], [1, "row", "d-flex", "align-items-center"], [1, "col-md-7", "col-lg-8"], [1, "text-center", "text-md-left"], [1, "col-md-5", "col-lg-4", "ml-lg-0"], [1, "text-center", "text-md-right"], [1, "list-unstyled", "list-inline"], [1, "list-inline-item"], ["mdbBtn", "", "floating", "true", "size", "sm", "mdbWavesEffect", "", 1, "rgba-white-slight", "mx-1"], ["fab", "", "icon", "facebook"], ["fab", "", "icon", "twitter"], ["fab", "", "fab", "", "icon", "instagram"], [1, "col-md-12", "contact-dev-div"], [1, "text-center", "contact-dev-p"]], template: function ContactBlockComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div", 0);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "footer", 1);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "div", 2);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](3, "div", 3);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](4, "div", 4);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](5, "h6", 5);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](6, "JEWELERY");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](7, "p");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](8, " Here we sell exactly what you need...!!! ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](9, "hr", 6);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](10, "div", 7);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](11, "h6", 8);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](12, "OVERVIEW");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](13, "p");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](14, "a", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](15, "About Us");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](16, "p");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](17, "a", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](18, "Contact Us");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](19, "hr", 6);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](20, "div", 4);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](21, "h6", 8);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](22, "CUSTOMER DELIGHT");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](23, "p");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](24, "a", 10);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](25, "Return, Exchange & Shipping Policy");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](26, "p");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](27, "a", 10);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](28, "FAQs");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](29, "p");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](30, "a", 10);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](31, "Track Your Order");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](32, "p");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](33, "a", 10);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](34, "Terms & Conditions and Privacy Policy");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](35, "hr", 6);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](36, "div", 11);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](37, "h6", 8);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](38, "GET IN TOUCH");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](39, "p");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](40, "mdb-icon", 12);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](41, "a", 13);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](42, "+1 (303) 499-7111");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](43, "hr", 14);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](44, "p");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](45, "mdb-icon", 15);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](46, "a", 16);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](47, "info@example.com");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](48, "hr", 14);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](49, "p");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](50, "mdb-icon", 17);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](51, " New York, NY 10012, US ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](52, "hr", 14);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](53, "hr", 18);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](54, "div", 19);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](55, "div", 20);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](56, "p", 21);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](57, "\u00A9 2020 Copyright: ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](58, "a", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](59, "strong");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](60, "Jwellery");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](61, "div", 22);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](62, "div", 23);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](63, "ul", 24);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](64, "li", 25);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](65, "a", 26);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](66, "mdb-icon", 27);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](67, "li", 25);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](68, "a", 26);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](69, "mdb-icon", 28);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](70, "li", 25);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](71, "a", 26);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](72, "mdb-icon", 29);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](73, "div", 30);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](74, "p", 31);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](75, " Like what you see, ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](76, "a");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](77, "Contact Developers..!!");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    } }, directives: [angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_1__["MdbIconComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_1__["FasDirective"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_1__["MdbBtnDirective"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_1__["WavesDirective"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_1__["FabDirective"]], styles: [".contact-container[_ngcontent-%COMP%], .mdb-color[_ngcontent-%COMP%] {\r\n    background-color: #001946 !important;\r\n    font-style: none !important;\r\n}\r\n\r\n.company-header[_ngcontent-%COMP%] {\r\n    letter-spacing: 5px;\r\n}\r\n\r\n.contact-div[_ngcontent-%COMP%], .add-div[_ngcontent-%COMP%] {\r\n    border: 1px #8db0ff solid !important;\r\n}\r\n\r\n.contact-dev-p[_ngcontent-%COMP%] {\r\n    font-size: 10px;\r\n    margin: 0;\r\n    padding: 0;\r\n}\r\n\r\n.hr[_ngcontent-%COMP%] {\r\n    margin: 0;\r\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvYm9keS1ibG9ja3MvY29udGFjdC1ibG9jay9jb250YWN0LWJsb2NrLmNvbXBvbmVudC5jc3MiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IkFBQUE7O0lBRUksb0NBQW9DO0lBQ3BDLDJCQUEyQjtBQUMvQjs7QUFFQTtJQUNJLG1CQUFtQjtBQUN2Qjs7QUFFQTs7SUFFSSxvQ0FBb0M7QUFDeEM7O0FBRUE7SUFDSSxlQUFlO0lBQ2YsU0FBUztJQUNULFVBQVU7QUFDZDs7QUFFQTtJQUNJLFNBQVM7QUFDYiIsImZpbGUiOiJzcmMvYXBwL2JvZHktYmxvY2tzL2NvbnRhY3QtYmxvY2svY29udGFjdC1ibG9jay5jb21wb25lbnQuY3NzIiwic291cmNlc0NvbnRlbnQiOlsiLmNvbnRhY3QtY29udGFpbmVyLFxyXG4ubWRiLWNvbG9yIHtcclxuICAgIGJhY2tncm91bmQtY29sb3I6ICMwMDE5NDYgIWltcG9ydGFudDtcclxuICAgIGZvbnQtc3R5bGU6IG5vbmUgIWltcG9ydGFudDtcclxufVxyXG5cclxuLmNvbXBhbnktaGVhZGVyIHtcclxuICAgIGxldHRlci1zcGFjaW5nOiA1cHg7XHJcbn1cclxuXHJcbi5jb250YWN0LWRpdixcclxuLmFkZC1kaXYge1xyXG4gICAgYm9yZGVyOiAxcHggIzhkYjBmZiBzb2xpZCAhaW1wb3J0YW50O1xyXG59XHJcblxyXG4uY29udGFjdC1kZXYtcCB7XHJcbiAgICBmb250LXNpemU6IDEwcHg7XHJcbiAgICBtYXJnaW46IDA7XHJcbiAgICBwYWRkaW5nOiAwO1xyXG59XHJcblxyXG4uaHIge1xyXG4gICAgbWFyZ2luOiAwO1xyXG59Il19 */"] });
/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵsetClassMetadata"](ContactBlockComponent, [{
        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"],
        args: [{
                selector: 'app-contact-block',
                templateUrl: './contact-block.component.html',
                styleUrls: ['./contact-block.component.css']
            }]
    }], function () { return []; }, null); })();


/***/ }),

/***/ "./src/app/body-blocks/new-arrivals-block/new-arrivals-block.component.ts":
/*!********************************************************************************!*\
  !*** ./src/app/body-blocks/new-arrivals-block/new-arrivals-block.component.ts ***!
  \********************************************************************************/
/*! exports provided: NewArrivalsBlockComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NewArrivalsBlockComponent", function() { return NewArrivalsBlockComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var src_app_models_new_arrivals_set_model__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! src/app/models/new_arrivals_set.model */ "./src/app/models/new_arrivals_set.model.ts");
/* harmony import */ var src_app_models_product_model__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! src/app/models/product.model */ "./src/app/models/product.model.ts");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/__ivy_ngcc__/fesm2015/common.js");
/* harmony import */ var angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! angular-bootstrap-md */ "./node_modules/angular-bootstrap-md/__ivy_ngcc__/fesm2015/angular-bootstrap-md.js");






function NewArrivalsBlockComponent_div_6_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div", 7);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "mdb-card", 8);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "div", 9);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](3, "mdb-card-img", 10);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](4, "a");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](5, "div", 11);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](6, "div", 12);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](7, "mdb-card-body", 13);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](8, "h5", 14);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](9);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](10, "h4", 15);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](11);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](12, "button", 16);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](13, "Buy");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](14, "div", 17);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](15, "div", 18);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](16, "span", 19);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](17);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](18, "span", 20);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](19, "mdb-icon", 21);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const item_r27 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("src", item_r27.imagePath);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](6);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](item_r27.categoryID);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](item_r27.productName);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](6);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate1"]("", item_r27.price, "$");
} }
function NewArrivalsBlockComponent_div_8_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div", 22);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "mdb-card", 23);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "div", 9);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](3, "mdb-card-img", 10);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](4, "a");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](5, "div", 11);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](6, "div", 12);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](7, "mdb-card-body", 13);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](8, "h4", 24);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](9);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](10, "div", 25);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](11, "h5", 26);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](12, "Learn More");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const item_r28 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("src", item_r28.src);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](6);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](item_r28.name);
} }
class NewArrivalsBlockComponent {
    constructor() {
        this.newArrivals = [];
        this.newArrivalsSet = [];
    }
    ngOnInit() {
        if (this.newArrivals.length == 0) {
            this.newArrivals.push(new src_app_models_product_model__WEBPACK_IMPORTED_MODULE_2__["Product"](1, 'assets/new_arrivals/p1.png', 'Custom Design Ring 24 carets gold', 'rings', 1000, '', '', '', ''));
            this.newArrivals.push(new src_app_models_product_model__WEBPACK_IMPORTED_MODULE_2__["Product"](2, 'assets/new_arrivals/p2.png', 'Double chain bracelet', 'chains', 100, '', '', '', ''));
            this.newArrivals.push(new src_app_models_product_model__WEBPACK_IMPORTED_MODULE_2__["Product"](3, 'assets/new_arrivals/p5.png', 'Gold plated bangle pair', 'bangles', 95, '', '', '', ''));
        }
        this.newArrivalsSet.push(new src_app_models_new_arrivals_set_model__WEBPACK_IMPORTED_MODULE_1__["NewArrivalSet"](1, 'assets/new_arrivals/b1.png', 'Wedding Set'));
        this.newArrivalsSet.push(new src_app_models_new_arrivals_set_model__WEBPACK_IMPORTED_MODULE_1__["NewArrivalSet"](1, 'assets/new_arrivals/b2.png', 'Evening Dress Gold Set'));
    }
}
NewArrivalsBlockComponent.ɵfac = function NewArrivalsBlockComponent_Factory(t) { return new (t || NewArrivalsBlockComponent)(); };
NewArrivalsBlockComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: NewArrivalsBlockComponent, selectors: [["app-new-arrivals-block"]], inputs: { newArrivals: "newArrivals" }, decls: 9, vars: 2, consts: [[1, "container-fluid", "new-arrival-container"], [1, "block-heading"], [1, "block-title"], ["src", "assets/line_star.png", 1, "line-stars"], [1, "row"], ["class", "col-md-4 new-arrival-item", 4, "ngFor", "ngForOf"], ["class", "col-md-6 new-arrival-set-item", 4, "ngFor", "ngForOf"], [1, "col-md-4", "new-arrival-item"], ["data-wow-duration", "1s", "data-wow-delay", "0.6s", "cascade", "true", "narrower", "true", 1, "new-arrival-card", "animate-color-left-right", "wow", "animate", "flipInX"], ["mdbWavesEffect", "", 1, "view", "view-cascade", "overlay", "waves-light"], [1, "new-arrival-img", 3, "src"], [1, "mask", "rgba-white-slight"], [1, "new-arrival-body"], ["cascade", "true", 1, "text-center", "pb-0", "px-0"], [1, "type-text"], [1, "card-title"], ["mdbBtn", "", "type", "button", "gradient", "peach", "rounded", "true", "mdbWavesEffect", "", 1, "buy-btn"], [1, "sub-items"], [1, "card-footer"], [2, "float", "left"], [1, "heart", 2, "float", "right"], ["far", "", "icon", "heart"], [1, "col-md-6", "new-arrival-set-item"], ["data-wow-duration", "1s", "data-wow-delay", "0.6s", "cascade", "true", "narrower", "true", 1, "new-arrival-set-card", "animate-color-left-right", "wow", "animate", "flipInY"], [1, "set-card-title"], [1, "text-left"], [1, "learn-more"]], template: function NewArrivalsBlockComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div", 0);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "div", 1);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "h3", 2);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](3, "NEW ARRIVALS");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](4, "img", 3);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](5, "div", 4);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](6, NewArrivalsBlockComponent_div_6_Template, 20, 4, "div", 5);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](7, "div", 4);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](8, NewArrivalsBlockComponent_div_8_Template, 13, 2, "div", 6);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    } if (rf & 2) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](6);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", ctx.newArrivals);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", ctx.newArrivalsSet);
    } }, directives: [_angular_common__WEBPACK_IMPORTED_MODULE_3__["NgForOf"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_4__["MdbCardComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_4__["WavesDirective"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_4__["MdbCardImageComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_4__["MdbCardBodyComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_4__["MdbBtnDirective"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_4__["MdbIconComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_4__["FarDirective"]], styles: [".new-arrival-container[_ngcontent-%COMP%] {\r\n    background-color: transparent;\r\n    padding: 50px 25px;\r\n    text-align: center;\r\n}\r\n\r\n.new-arrival-set-item[_ngcontent-%COMP%], .new-arrival-item[_ngcontent-%COMP%] {\r\n    margin-bottom: 13px;\r\n}\r\n\r\n.new-arrival-body[_ngcontent-%COMP%]   .buy-btn[_ngcontent-%COMP%] {\r\n    position: absolute;\r\n    right: 10px;\r\n    bottom: 10px;\r\n    padding: 10px 40px;\r\n    display: none;\r\n    -webkit-animation: slow-disp 1s;\r\n            animation: slow-disp 1s;\r\n}\r\n\r\n.new-arrival-body[_ngcontent-%COMP%]   .sub-items[_ngcontent-%COMP%] {\r\n    position: absolute;\r\n    top: 250px;\r\n    width: 100%;\r\n    background: white;\r\n    z-index: 1;\r\n    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px 0 rgba(0, 0, 0, .12);\r\n    border-radius: 0px 0px 30px 0px;\r\n    display: none;\r\n    -webkit-animation: slow-disp 1s;\r\n            animation: slow-disp 1s;\r\n}\r\n\r\n.new-arrival-item[_ngcontent-%COMP%]:hover   .new-arrival-body[_ngcontent-%COMP%]   .sub-items[_ngcontent-%COMP%], .new-arrival-item[_ngcontent-%COMP%]:hover   .new-arrival-body[_ngcontent-%COMP%]   .buy-btn[_ngcontent-%COMP%] {\r\n    display: block;\r\n}\r\n\r\n.new-arrival-item[_ngcontent-%COMP%]:hover   .new-arrival-card[_ngcontent-%COMP%] {\r\n    border-radius: 30px 0px 0px 0px;\r\n}\r\n\r\nmdb-card[_ngcontent-%COMP%] {\r\n    box-shadow: none;\r\n}\r\n\r\n.new-arrival-card[_ngcontent-%COMP%] {\r\n    width: 380px;\r\n    height: 250px;\r\n    margin-bottom: 50px;\r\n}\r\n\r\n.block-title[_ngcontent-%COMP%] {\r\n    position: relative;\r\n    font-size: 20px;\r\n    margin-bottom: 5px;\r\n}\r\n\r\n.line-stars[_ngcontent-%COMP%] {\r\n    width: 150px;\r\n    height: 10px;\r\n    margin-bottom: 20px;\r\n    margin-right: 10px;\r\n}\r\n\r\n.view[_ngcontent-%COMP%] {\r\n    overflow: visible !important;\r\n}\r\n\r\n.card-footer[_ngcontent-%COMP%] {\r\n    background: none;\r\n    padding: 10px 40px;\r\n    padding-bottom: 30px;\r\n    font-family: 'Josefin Sans', sans-serif;\r\n}\r\n\r\n.card-footer[_ngcontent-%COMP%]   .heart[_ngcontent-%COMP%]:hover {\r\n    cursor: pointer;\r\n}\r\n\r\n.set-card-title[_ngcontent-%COMP%], .card-title[_ngcontent-%COMP%] {\r\n    position: absolute;\r\n    top: 50px;\r\n    left: 30px;\r\n    width: 150px;\r\n    text-align: left;\r\n    font-size: 18px;\r\n    font-family: 'Spectral SC', serif;\r\n}\r\n\r\n.set-card-title[_ngcontent-%COMP%] {\r\n    left: 50px;\r\n}\r\n\r\n.type-text[_ngcontent-%COMP%] {\r\n    position: absolute;\r\n    left: 30px;\r\n    bottom: 10px;\r\n    font-size: 12px;\r\n    font-family: 'Josefin Sans', sans-serif;\r\n}\r\n\r\n.animate-color-left-right[_ngcontent-%COMP%] {\r\n    box-shadow: none;\r\n    background: linear-gradient(45deg, beige 35%, #e2e2e2b8 30%);\r\n    \r\n    background-size: 200% 100%;\r\n    background-position: right bottom;\r\n    transition: all 0.3s ease;\r\n    transition-delay: 0.2s;\r\n}\r\n\r\n.animate-color-left-right[_ngcontent-%COMP%]:hover {\r\n    background-position: left bottom;\r\n    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.28), 0 2px 10px 0 rgba(0, 0, 0, 0.29);\r\n}\r\n\r\n.animate-color-left-right[_ngcontent-%COMP%]:hover   .new-arrival-body[_ngcontent-%COMP%]   mdb-card-body[_ngcontent-%COMP%]   .text-left[_ngcontent-%COMP%]   .learn-more[_ngcontent-%COMP%] {\r\n    font-size: 16px;\r\n    font-weight: 900;\r\n}\r\n\r\n.learn-more[_ngcontent-%COMP%] {\r\n    cursor: pointer;\r\n    padding: 10px 50px;\r\n    font-size: 12px;\r\n    font-family: 'Josefin Sans', sans-serif;\r\n    text-decoration: underline;\r\n}\r\n\r\n\r\n\r\n@media only screen and (max-width: 1200px) and (min-width: 1100px) {\r\n    .new-arrival-card[_ngcontent-%COMP%] {\r\n        width: 340px;\r\n        height: 250px;\r\n    }\r\n    .card-title[_ngcontent-%COMP%] {\r\n        width: 120px;\r\n        font-size: 16px;\r\n    }\r\n}\r\n\r\n@media only screen and (max-width: 1100px) and (min-width: 990px) {\r\n    .new-arrival-card[_ngcontent-%COMP%] {\r\n        width: 300px;\r\n        height: 250px;\r\n    }\r\n    .card-title[_ngcontent-%COMP%] {\r\n        width: 120px;\r\n        font-size: 16px;\r\n    }\r\n}\r\n\r\n@media only screen and (max-width: 990px) and (min-width: 890px) {\r\n    .new-arrival-card[_ngcontent-%COMP%] {\r\n        width: 270px;\r\n        height: 240px;\r\n    }\r\n    .card-title[_ngcontent-%COMP%] {\r\n        width: 100px;\r\n        font-size: 14px;\r\n    }\r\n}\r\n\r\n@media only screen and (max-width: 890px) and (min-width: 768px) {\r\n    .new-arrival-card[_ngcontent-%COMP%] {\r\n        width: 230px;\r\n        height: 240px;\r\n    }\r\n    .card-title[_ngcontent-%COMP%] {\r\n        width: 100px;\r\n        font-size: 14px;\r\n    }\r\n}\r\n\r\n@media only screen and (max-width: 768px) {\r\n    .new-arrival-card[_ngcontent-%COMP%] {\r\n        margin: 0 auto;\r\n        margin-bottom: 50px;\r\n    }\r\n    .card-title[_ngcontent-%COMP%] {\r\n        width: 200px;\r\n        font-size: 18px;\r\n    }\r\n}\r\n\r\n@-webkit-keyframes slow-disp {\r\n    0% {\r\n        opacity: 0;\r\n    }\r\n    100% {\r\n        opacity: 1;\r\n    }\r\n}\r\n\r\n@keyframes slow-disp {\r\n    0% {\r\n        opacity: 0;\r\n    }\r\n    100% {\r\n        opacity: 1;\r\n    }\r\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvYm9keS1ibG9ja3MvbmV3LWFycml2YWxzLWJsb2NrL25ldy1hcnJpdmFscy1ibG9jay5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0lBQ0ksNkJBQTZCO0lBQzdCLGtCQUFrQjtJQUNsQixrQkFBa0I7QUFDdEI7O0FBRUE7O0lBRUksbUJBQW1CO0FBQ3ZCOztBQUVBO0lBQ0ksa0JBQWtCO0lBQ2xCLFdBQVc7SUFDWCxZQUFZO0lBQ1osa0JBQWtCO0lBQ2xCLGFBQWE7SUFDYiwrQkFBdUI7WUFBdkIsdUJBQXVCO0FBQzNCOztBQUVBO0lBQ0ksa0JBQWtCO0lBQ2xCLFVBQVU7SUFDVixXQUFXO0lBQ1gsaUJBQWlCO0lBQ2pCLFVBQVU7SUFDViwyRUFBMkU7SUFDM0UsK0JBQStCO0lBQy9CLGFBQWE7SUFDYiwrQkFBdUI7WUFBdkIsdUJBQXVCO0FBQzNCOztBQUVBOztJQUVJLGNBQWM7QUFDbEI7O0FBRUE7SUFDSSwrQkFBK0I7QUFDbkM7O0FBRUE7SUFDSSxnQkFBZ0I7QUFDcEI7O0FBRUE7SUFDSSxZQUFZO0lBQ1osYUFBYTtJQUNiLG1CQUFtQjtBQUN2Qjs7QUFFQTtJQUNJLGtCQUFrQjtJQUNsQixlQUFlO0lBQ2Ysa0JBQWtCO0FBQ3RCOztBQUVBO0lBQ0ksWUFBWTtJQUNaLFlBQVk7SUFDWixtQkFBbUI7SUFDbkIsa0JBQWtCO0FBQ3RCOztBQUVBO0lBQ0ksNEJBQTRCO0FBQ2hDOztBQUVBO0lBQ0ksZ0JBQWdCO0lBQ2hCLGtCQUFrQjtJQUNsQixvQkFBb0I7SUFDcEIsdUNBQXVDO0FBQzNDOztBQUVBO0lBQ0ksZUFBZTtBQUNuQjs7QUFFQTs7SUFFSSxrQkFBa0I7SUFDbEIsU0FBUztJQUNULFVBQVU7SUFDVixZQUFZO0lBQ1osZ0JBQWdCO0lBQ2hCLGVBQWU7SUFDZixpQ0FBaUM7QUFDckM7O0FBRUE7SUFDSSxVQUFVO0FBQ2Q7O0FBRUE7SUFDSSxrQkFBa0I7SUFDbEIsVUFBVTtJQUNWLFlBQVk7SUFDWixlQUFlO0lBQ2YsdUNBQXVDO0FBQzNDOztBQUVBO0lBQ0ksZ0JBQWdCO0lBQ2hCLDREQUE0RDtJQUM1RCxvRUFBb0U7SUFDcEUsMEJBQTBCO0lBQzFCLGlDQUFpQztJQUNqQyx5QkFBeUI7SUFDekIsc0JBQXNCO0FBQzFCOztBQUVBO0lBQ0ksZ0NBQWdDO0lBQ2hDLDZFQUE2RTtBQUNqRjs7QUFFQTtJQUNJLGVBQWU7SUFDZixnQkFBZ0I7QUFDcEI7O0FBRUE7SUFDSSxlQUFlO0lBQ2Ysa0JBQWtCO0lBQ2xCLGVBQWU7SUFDZix1Q0FBdUM7SUFDdkMsMEJBQTBCO0FBQzlCOztBQUdBLG9EQUFvRDs7QUFFcEQ7SUFDSTtRQUNJLFlBQVk7UUFDWixhQUFhO0lBQ2pCO0lBQ0E7UUFDSSxZQUFZO1FBQ1osZUFBZTtJQUNuQjtBQUNKOztBQUVBO0lBQ0k7UUFDSSxZQUFZO1FBQ1osYUFBYTtJQUNqQjtJQUNBO1FBQ0ksWUFBWTtRQUNaLGVBQWU7SUFDbkI7QUFDSjs7QUFFQTtJQUNJO1FBQ0ksWUFBWTtRQUNaLGFBQWE7SUFDakI7SUFDQTtRQUNJLFlBQVk7UUFDWixlQUFlO0lBQ25CO0FBQ0o7O0FBRUE7SUFDSTtRQUNJLFlBQVk7UUFDWixhQUFhO0lBQ2pCO0lBQ0E7UUFDSSxZQUFZO1FBQ1osZUFBZTtJQUNuQjtBQUNKOztBQUVBO0lBQ0k7UUFDSSxjQUFjO1FBQ2QsbUJBQW1CO0lBQ3ZCO0lBQ0E7UUFDSSxZQUFZO1FBQ1osZUFBZTtJQUNuQjtBQUNKOztBQUVBO0lBQ0k7UUFDSSxVQUFVO0lBQ2Q7SUFDQTtRQUNJLFVBQVU7SUFDZDtBQUNKOztBQVBBO0lBQ0k7UUFDSSxVQUFVO0lBQ2Q7SUFDQTtRQUNJLFVBQVU7SUFDZDtBQUNKIiwiZmlsZSI6InNyYy9hcHAvYm9keS1ibG9ja3MvbmV3LWFycml2YWxzLWJsb2NrL25ldy1hcnJpdmFscy1ibG9jay5jb21wb25lbnQuY3NzIiwic291cmNlc0NvbnRlbnQiOlsiLm5ldy1hcnJpdmFsLWNvbnRhaW5lciB7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiB0cmFuc3BhcmVudDtcclxuICAgIHBhZGRpbmc6IDUwcHggMjVweDtcclxuICAgIHRleHQtYWxpZ246IGNlbnRlcjtcclxufVxyXG5cclxuLm5ldy1hcnJpdmFsLXNldC1pdGVtLFxyXG4ubmV3LWFycml2YWwtaXRlbSB7XHJcbiAgICBtYXJnaW4tYm90dG9tOiAxM3B4O1xyXG59XHJcblxyXG4ubmV3LWFycml2YWwtYm9keSAuYnV5LWJ0biB7XHJcbiAgICBwb3NpdGlvbjogYWJzb2x1dGU7XHJcbiAgICByaWdodDogMTBweDtcclxuICAgIGJvdHRvbTogMTBweDtcclxuICAgIHBhZGRpbmc6IDEwcHggNDBweDtcclxuICAgIGRpc3BsYXk6IG5vbmU7XHJcbiAgICBhbmltYXRpb246IHNsb3ctZGlzcCAxcztcclxufVxyXG5cclxuLm5ldy1hcnJpdmFsLWJvZHkgLnN1Yi1pdGVtcyB7XHJcbiAgICBwb3NpdGlvbjogYWJzb2x1dGU7XHJcbiAgICB0b3A6IDI1MHB4O1xyXG4gICAgd2lkdGg6IDEwMCU7XHJcbiAgICBiYWNrZ3JvdW5kOiB3aGl0ZTtcclxuICAgIHotaW5kZXg6IDE7XHJcbiAgICBib3gtc2hhZG93OiAwIDJweCA1cHggMCByZ2JhKDAsIDAsIDAsIC4xNiksIDAgMnB4IDEwcHggMCByZ2JhKDAsIDAsIDAsIC4xMik7XHJcbiAgICBib3JkZXItcmFkaXVzOiAwcHggMHB4IDMwcHggMHB4O1xyXG4gICAgZGlzcGxheTogbm9uZTtcclxuICAgIGFuaW1hdGlvbjogc2xvdy1kaXNwIDFzO1xyXG59XHJcblxyXG4ubmV3LWFycml2YWwtaXRlbTpob3ZlciAubmV3LWFycml2YWwtYm9keSAuc3ViLWl0ZW1zLFxyXG4ubmV3LWFycml2YWwtaXRlbTpob3ZlciAubmV3LWFycml2YWwtYm9keSAuYnV5LWJ0biB7XHJcbiAgICBkaXNwbGF5OiBibG9jaztcclxufVxyXG5cclxuLm5ldy1hcnJpdmFsLWl0ZW06aG92ZXIgLm5ldy1hcnJpdmFsLWNhcmQge1xyXG4gICAgYm9yZGVyLXJhZGl1czogMzBweCAwcHggMHB4IDBweDtcclxufVxyXG5cclxubWRiLWNhcmQge1xyXG4gICAgYm94LXNoYWRvdzogbm9uZTtcclxufVxyXG5cclxuLm5ldy1hcnJpdmFsLWNhcmQge1xyXG4gICAgd2lkdGg6IDM4MHB4O1xyXG4gICAgaGVpZ2h0OiAyNTBweDtcclxuICAgIG1hcmdpbi1ib3R0b206IDUwcHg7XHJcbn1cclxuXHJcbi5ibG9jay10aXRsZSB7XHJcbiAgICBwb3NpdGlvbjogcmVsYXRpdmU7XHJcbiAgICBmb250LXNpemU6IDIwcHg7XHJcbiAgICBtYXJnaW4tYm90dG9tOiA1cHg7XHJcbn1cclxuXHJcbi5saW5lLXN0YXJzIHtcclxuICAgIHdpZHRoOiAxNTBweDtcclxuICAgIGhlaWdodDogMTBweDtcclxuICAgIG1hcmdpbi1ib3R0b206IDIwcHg7XHJcbiAgICBtYXJnaW4tcmlnaHQ6IDEwcHg7XHJcbn1cclxuXHJcbi52aWV3IHtcclxuICAgIG92ZXJmbG93OiB2aXNpYmxlICFpbXBvcnRhbnQ7XHJcbn1cclxuXHJcbi5jYXJkLWZvb3RlciB7XHJcbiAgICBiYWNrZ3JvdW5kOiBub25lO1xyXG4gICAgcGFkZGluZzogMTBweCA0MHB4O1xyXG4gICAgcGFkZGluZy1ib3R0b206IDMwcHg7XHJcbiAgICBmb250LWZhbWlseTogJ0pvc2VmaW4gU2FucycsIHNhbnMtc2VyaWY7XHJcbn1cclxuXHJcbi5jYXJkLWZvb3RlciAuaGVhcnQ6aG92ZXIge1xyXG4gICAgY3Vyc29yOiBwb2ludGVyO1xyXG59XHJcblxyXG4uc2V0LWNhcmQtdGl0bGUsXHJcbi5jYXJkLXRpdGxlIHtcclxuICAgIHBvc2l0aW9uOiBhYnNvbHV0ZTtcclxuICAgIHRvcDogNTBweDtcclxuICAgIGxlZnQ6IDMwcHg7XHJcbiAgICB3aWR0aDogMTUwcHg7XHJcbiAgICB0ZXh0LWFsaWduOiBsZWZ0O1xyXG4gICAgZm9udC1zaXplOiAxOHB4O1xyXG4gICAgZm9udC1mYW1pbHk6ICdTcGVjdHJhbCBTQycsIHNlcmlmO1xyXG59XHJcblxyXG4uc2V0LWNhcmQtdGl0bGUge1xyXG4gICAgbGVmdDogNTBweDtcclxufVxyXG5cclxuLnR5cGUtdGV4dCB7XHJcbiAgICBwb3NpdGlvbjogYWJzb2x1dGU7XHJcbiAgICBsZWZ0OiAzMHB4O1xyXG4gICAgYm90dG9tOiAxMHB4O1xyXG4gICAgZm9udC1zaXplOiAxMnB4O1xyXG4gICAgZm9udC1mYW1pbHk6ICdKb3NlZmluIFNhbnMnLCBzYW5zLXNlcmlmO1xyXG59XHJcblxyXG4uYW5pbWF0ZS1jb2xvci1sZWZ0LXJpZ2h0IHtcclxuICAgIGJveC1zaGFkb3c6IG5vbmU7XHJcbiAgICBiYWNrZ3JvdW5kOiBsaW5lYXItZ3JhZGllbnQoNDVkZWcsIGJlaWdlIDM1JSwgI2UyZTJlMmI4IDMwJSk7XHJcbiAgICAvKiBiYWNrZ3JvdW5kOiBsaW5lYXItZ3JhZGllbnQodG8gbGVmdCwgI2UyZTJlMmI4IDUwJSwgYmVpZ2UgNTAlKTsgKi9cclxuICAgIGJhY2tncm91bmQtc2l6ZTogMjAwJSAxMDAlO1xyXG4gICAgYmFja2dyb3VuZC1wb3NpdGlvbjogcmlnaHQgYm90dG9tO1xyXG4gICAgdHJhbnNpdGlvbjogYWxsIDAuM3MgZWFzZTtcclxuICAgIHRyYW5zaXRpb24tZGVsYXk6IDAuMnM7XHJcbn1cclxuXHJcbi5hbmltYXRlLWNvbG9yLWxlZnQtcmlnaHQ6aG92ZXIge1xyXG4gICAgYmFja2dyb3VuZC1wb3NpdGlvbjogbGVmdCBib3R0b207XHJcbiAgICBib3gtc2hhZG93OiAwIDJweCA1cHggMCByZ2JhKDAsIDAsIDAsIDAuMjgpLCAwIDJweCAxMHB4IDAgcmdiYSgwLCAwLCAwLCAwLjI5KTtcclxufVxyXG5cclxuLmFuaW1hdGUtY29sb3ItbGVmdC1yaWdodDpob3ZlciAubmV3LWFycml2YWwtYm9keSBtZGItY2FyZC1ib2R5IC50ZXh0LWxlZnQgLmxlYXJuLW1vcmUge1xyXG4gICAgZm9udC1zaXplOiAxNnB4O1xyXG4gICAgZm9udC13ZWlnaHQ6IDkwMDtcclxufVxyXG5cclxuLmxlYXJuLW1vcmUge1xyXG4gICAgY3Vyc29yOiBwb2ludGVyO1xyXG4gICAgcGFkZGluZzogMTBweCA1MHB4O1xyXG4gICAgZm9udC1zaXplOiAxMnB4O1xyXG4gICAgZm9udC1mYW1pbHk6ICdKb3NlZmluIFNhbnMnLCBzYW5zLXNlcmlmO1xyXG4gICAgdGV4dC1kZWNvcmF0aW9uOiB1bmRlcmxpbmU7XHJcbn1cclxuXHJcblxyXG4vKiBUbyBtYWtlIGNhcmRzIGFwcGVhciBzbWFsbCBhcyBzY3JlZW4gZ29lcyBzbWFsbCAqL1xyXG5cclxuQG1lZGlhIG9ubHkgc2NyZWVuIGFuZCAobWF4LXdpZHRoOiAxMjAwcHgpIGFuZCAobWluLXdpZHRoOiAxMTAwcHgpIHtcclxuICAgIC5uZXctYXJyaXZhbC1jYXJkIHtcclxuICAgICAgICB3aWR0aDogMzQwcHg7XHJcbiAgICAgICAgaGVpZ2h0OiAyNTBweDtcclxuICAgIH1cclxuICAgIC5jYXJkLXRpdGxlIHtcclxuICAgICAgICB3aWR0aDogMTIwcHg7XHJcbiAgICAgICAgZm9udC1zaXplOiAxNnB4O1xyXG4gICAgfVxyXG59XHJcblxyXG5AbWVkaWEgb25seSBzY3JlZW4gYW5kIChtYXgtd2lkdGg6IDExMDBweCkgYW5kIChtaW4td2lkdGg6IDk5MHB4KSB7XHJcbiAgICAubmV3LWFycml2YWwtY2FyZCB7XHJcbiAgICAgICAgd2lkdGg6IDMwMHB4O1xyXG4gICAgICAgIGhlaWdodDogMjUwcHg7XHJcbiAgICB9XHJcbiAgICAuY2FyZC10aXRsZSB7XHJcbiAgICAgICAgd2lkdGg6IDEyMHB4O1xyXG4gICAgICAgIGZvbnQtc2l6ZTogMTZweDtcclxuICAgIH1cclxufVxyXG5cclxuQG1lZGlhIG9ubHkgc2NyZWVuIGFuZCAobWF4LXdpZHRoOiA5OTBweCkgYW5kIChtaW4td2lkdGg6IDg5MHB4KSB7XHJcbiAgICAubmV3LWFycml2YWwtY2FyZCB7XHJcbiAgICAgICAgd2lkdGg6IDI3MHB4O1xyXG4gICAgICAgIGhlaWdodDogMjQwcHg7XHJcbiAgICB9XHJcbiAgICAuY2FyZC10aXRsZSB7XHJcbiAgICAgICAgd2lkdGg6IDEwMHB4O1xyXG4gICAgICAgIGZvbnQtc2l6ZTogMTRweDtcclxuICAgIH1cclxufVxyXG5cclxuQG1lZGlhIG9ubHkgc2NyZWVuIGFuZCAobWF4LXdpZHRoOiA4OTBweCkgYW5kIChtaW4td2lkdGg6IDc2OHB4KSB7XHJcbiAgICAubmV3LWFycml2YWwtY2FyZCB7XHJcbiAgICAgICAgd2lkdGg6IDIzMHB4O1xyXG4gICAgICAgIGhlaWdodDogMjQwcHg7XHJcbiAgICB9XHJcbiAgICAuY2FyZC10aXRsZSB7XHJcbiAgICAgICAgd2lkdGg6IDEwMHB4O1xyXG4gICAgICAgIGZvbnQtc2l6ZTogMTRweDtcclxuICAgIH1cclxufVxyXG5cclxuQG1lZGlhIG9ubHkgc2NyZWVuIGFuZCAobWF4LXdpZHRoOiA3NjhweCkge1xyXG4gICAgLm5ldy1hcnJpdmFsLWNhcmQge1xyXG4gICAgICAgIG1hcmdpbjogMCBhdXRvO1xyXG4gICAgICAgIG1hcmdpbi1ib3R0b206IDUwcHg7XHJcbiAgICB9XHJcbiAgICAuY2FyZC10aXRsZSB7XHJcbiAgICAgICAgd2lkdGg6IDIwMHB4O1xyXG4gICAgICAgIGZvbnQtc2l6ZTogMThweDtcclxuICAgIH1cclxufVxyXG5cclxuQGtleWZyYW1lcyBzbG93LWRpc3Age1xyXG4gICAgMCUge1xyXG4gICAgICAgIG9wYWNpdHk6IDA7XHJcbiAgICB9XHJcbiAgICAxMDAlIHtcclxuICAgICAgICBvcGFjaXR5OiAxO1xyXG4gICAgfVxyXG59Il19 */"] });
/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵsetClassMetadata"](NewArrivalsBlockComponent, [{
        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"],
        args: [{
                selector: 'app-new-arrivals-block',
                templateUrl: './new-arrivals-block.component.html',
                styleUrls: ['./new-arrivals-block.component.css']
            }]
    }], function () { return []; }, { newArrivals: [{
            type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"]
        }] }); })();


/***/ }),

/***/ "./src/app/body-blocks/popular-collection-block/popular-collection-block.component.ts":
/*!********************************************************************************************!*\
  !*** ./src/app/body-blocks/popular-collection-block/popular-collection-block.component.ts ***!
  \********************************************************************************************/
/*! exports provided: PopularCollectionBlockComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PopularCollectionBlockComponent", function() { return PopularCollectionBlockComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var src_app_models_category_model__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! src/app/models/category.model */ "./src/app/models/category.model.ts");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/__ivy_ngcc__/fesm2015/common.js");
/* harmony import */ var angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! angular-bootstrap-md */ "./node_modules/angular-bootstrap-md/__ivy_ngcc__/fesm2015/angular-bootstrap-md.js");





function PopularCollectionBlockComponent_div_6_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div", 6);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "mdb-card", 7);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "div", 8);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](3, "mdb-card-img", 9);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](4, "mdb-card-body", 10);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](5, "h5", 11);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](6);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](7, "h4", 12);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](8);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](9, "mdb-card-text");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](10, "mdb-icon", 13);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const item_r24 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("src", item_r24.imagePath);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate1"](" ", item_r24.categoryName, " ");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](item_r24.viewName);
} }
class PopularCollectionBlockComponent {
    constructor() {
        this.popularCollections = [];
    }
    ngOnInit() {
        if (this.popularCollections.length == 0) {
            this.popularCollections.push(new src_app_models_category_model__WEBPACK_IMPORTED_MODULE_1__["Category"](1, 'assets/popular_collections/p1.png', 'rings', 'Popular Rings'));
            this.popularCollections.push(new src_app_models_category_model__WEBPACK_IMPORTED_MODULE_1__["Category"](2, 'assets/popular_collections/p2.png', 'chains', 'Popular Chain'));
            this.popularCollections.push(new src_app_models_category_model__WEBPACK_IMPORTED_MODULE_1__["Category"](3, 'assets/popular_collections/p3.png', 'pendents', 'Popular Pendents'));
            this.popularCollections.push(new src_app_models_category_model__WEBPACK_IMPORTED_MODULE_1__["Category"](4, 'assets/popular_collections/p5.png', 'bangles', 'Popular Bangles'));
        }
    }
}
PopularCollectionBlockComponent.ɵfac = function PopularCollectionBlockComponent_Factory(t) { return new (t || PopularCollectionBlockComponent)(); };
PopularCollectionBlockComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: PopularCollectionBlockComponent, selectors: [["app-popular-collection-block"]], inputs: { popularCollections: "popularCollections" }, decls: 7, vars: 1, consts: [[1, "container-fluid", "popular-container"], [1, "block-heading"], [1, "block-title"], ["src", "assets/line_star.png", 1, "line-stars"], [1, "row"], ["class", "col-md-3 popular-item", 4, "ngFor", "ngForOf"], [1, "col-md-3", "popular-item"], ["data-wow-duration", "1s", "data-wow-delay", "0.6s", "cascade", "true", "narrower", "true", 1, "popular-card", "animated", "wow", "rotateInDownLeft"], ["mdbWavesEffect", "", 1, "view", "view-cascade", "overlay", "waves-light"], [1, "popular-img", 3, "src"], ["cascade", "true", 1, "text-center", "popular-card-body"], [1, "type-text"], [1, "card-title"], ["fas", "", "icon", "angle-right", 1, "card-forward"]], template: function PopularCollectionBlockComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div", 0);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "div", 1);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "h3", 2);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](3, "POPULAR COLLECTION");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](4, "img", 3);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](5, "div", 4);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](6, PopularCollectionBlockComponent_div_6_Template, 11, 3, "div", 5);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    } if (rf & 2) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](6);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", ctx.popularCollections);
    } }, directives: [_angular_common__WEBPACK_IMPORTED_MODULE_2__["NgForOf"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_3__["MdbCardComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_3__["WavesDirective"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_3__["MdbCardImageComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_3__["MdbCardBodyComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_3__["MdbCardTextComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_3__["MdbIconComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_3__["FasDirective"]], styles: [".popular-container[_ngcontent-%COMP%] {\r\n    background-color: transparent;\r\n    padding: 70px 10px;\r\n    text-align: center;\r\n}\r\n\r\n.popular-item[_ngcontent-%COMP%] {\r\n    margin-bottom: 3px;\r\n}\r\n\r\n.popular-card[_ngcontent-%COMP%] {\r\n    width: 250px;\r\n    height: 270px;\r\n    margin-left: 20px;\r\n    background: linear-gradient(to left, #edededb8 50%, beige 50%);\r\n    background-size: 200% 100%;\r\n    background-position: right bottom;\r\n    transition: all 0.2s ease;\r\n    transition-delay: 0.2s;\r\n}\r\n\r\n.popular-card[_ngcontent-%COMP%]:hover {\r\n    background-position: left bottom;\r\n    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.28), 0 2px 10px 0 rgba(0, 0, 0, 0.29);\r\n}\r\n\r\n.block-title[_ngcontent-%COMP%] {\r\n    position: relative;\r\n    font-size: 20px;\r\n    margin-bottom: 5px;\r\n}\r\n\r\n.line-stars[_ngcontent-%COMP%] {\r\n    width: 150px;\r\n    height: 10px;\r\n    margin-bottom: 80px;\r\n    margin-right: 10px;\r\n}\r\n\r\n.view[_ngcontent-%COMP%] {\r\n    overflow: visible !important;\r\n}\r\n\r\n.type-text[_ngcontent-%COMP%] {\r\n    color: #b9b9b9 !important;\r\n    text-shadow: 1px 1px 1px black, 1px 1px 1px black;\r\n    font-size: 10px;\r\n    cursor: pointer;\r\n    font-family: 'Josefin Sans', sans-serif;\r\n    margin: 0;\r\n}\r\n\r\n.popular-card-body[_ngcontent-%COMP%] {\r\n    position: absolute;\r\n    flex: 1 1 auto;\r\n    width: 250px;\r\n    bottom: 0px;\r\n    height: 70px;\r\n    padding-top: 5px;\r\n    background: #000000a6;\r\n    color: white;\r\n    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px 0 rgba(0, 0, 0, .12);\r\n}\r\n\r\n.card-text[_ngcontent-%COMP%] {\r\n    font-size: 15px;\r\n}\r\n\r\n.card-title[_ngcontent-%COMP%] {\r\n    padding: 0;\r\n    font-size: 22px;\r\n    font-family: none;\r\n    margin: 0;\r\n    cursor: pointer;\r\n}\r\n\r\n.card-forward[_ngcontent-%COMP%] {\r\n    font-size: 20px;\r\n    font-weight: bolder;\r\n    color: white;\r\n    \r\n    font-family: none;\r\n    cursor: pointer;\r\n}\r\n\r\n\r\n\r\n@media only screen and (max-width: 1200px) and (min-width: 1050px) {\r\n    .popular-card[_ngcontent-%COMP%] {\r\n        width: 250px;\r\n        height: 270px;\r\n        margin-left: 5px;\r\n    }\r\n}\r\n\r\n@media only screen and (max-width: 1050px) and (min-width: 850px) {\r\n    .popular-card[_ngcontent-%COMP%] {\r\n        width: 200px;\r\n        height: 290px;\r\n        margin-left: 5px;\r\n    }\r\n    .popular-card-body[_ngcontent-%COMP%] {\r\n        width: 200px;\r\n        height: 55px;\r\n    }\r\n    .card-title[_ngcontent-%COMP%] {\r\n        font-size: 16px;\r\n    }\r\n    .card-text[_ngcontent-%COMP%] {\r\n        font-size: 12px;\r\n        margin-top: -4px;\r\n    }\r\n}\r\n\r\n@media only screen and (max-width: 850px) and (min-width: 768px) {\r\n    .popular-card[_ngcontent-%COMP%] {\r\n        width: 180px;\r\n        height: 290px;\r\n        margin-left: 5px;\r\n    }\r\n    .popular-card-body[_ngcontent-%COMP%] {\r\n        width: 180px;\r\n        height: 55px;\r\n    }\r\n    .card-title[_ngcontent-%COMP%] {\r\n        font-size: 16px;\r\n    }\r\n}\r\n\r\n@media only screen and (max-width: 768px) {\r\n    .popular-card[_ngcontent-%COMP%] {\r\n        margin: 0 auto;\r\n        margin-bottom: 20px;\r\n    }\r\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvYm9keS1ibG9ja3MvcG9wdWxhci1jb2xsZWN0aW9uLWJsb2NrL3BvcHVsYXItY29sbGVjdGlvbi1ibG9jay5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0lBQ0ksNkJBQTZCO0lBQzdCLGtCQUFrQjtJQUNsQixrQkFBa0I7QUFDdEI7O0FBRUE7SUFDSSxrQkFBa0I7QUFDdEI7O0FBRUE7SUFDSSxZQUFZO0lBQ1osYUFBYTtJQUNiLGlCQUFpQjtJQUNqQiw4REFBOEQ7SUFDOUQsMEJBQTBCO0lBQzFCLGlDQUFpQztJQUNqQyx5QkFBeUI7SUFDekIsc0JBQXNCO0FBQzFCOztBQUVBO0lBQ0ksZ0NBQWdDO0lBQ2hDLDZFQUE2RTtBQUNqRjs7QUFFQTtJQUNJLGtCQUFrQjtJQUNsQixlQUFlO0lBQ2Ysa0JBQWtCO0FBQ3RCOztBQUVBO0lBQ0ksWUFBWTtJQUNaLFlBQVk7SUFDWixtQkFBbUI7SUFDbkIsa0JBQWtCO0FBQ3RCOztBQUVBO0lBQ0ksNEJBQTRCO0FBQ2hDOztBQUVBO0lBQ0kseUJBQXlCO0lBQ3pCLGlEQUFpRDtJQUNqRCxlQUFlO0lBQ2YsZUFBZTtJQUNmLHVDQUF1QztJQUN2QyxTQUFTO0FBQ2I7O0FBRUE7SUFDSSxrQkFBa0I7SUFDbEIsY0FBYztJQUNkLFlBQVk7SUFDWixXQUFXO0lBQ1gsWUFBWTtJQUNaLGdCQUFnQjtJQUNoQixxQkFBcUI7SUFDckIsWUFBWTtJQUNaLDJFQUEyRTtBQUMvRTs7QUFFQTtJQUNJLGVBQWU7QUFDbkI7O0FBRUE7SUFDSSxVQUFVO0lBQ1YsZUFBZTtJQUNmLGlCQUFpQjtJQUNqQixTQUFTO0lBQ1QsZUFBZTtBQUNuQjs7QUFFQTtJQUNJLGVBQWU7SUFDZixtQkFBbUI7SUFDbkIsWUFBWTtJQUNaLGdDQUFnQztJQUNoQyxpQkFBaUI7SUFDakIsZUFBZTtBQUNuQjs7QUFHQSxvREFBb0Q7O0FBRXBEO0lBQ0k7UUFDSSxZQUFZO1FBQ1osYUFBYTtRQUNiLGdCQUFnQjtJQUNwQjtBQUNKOztBQUVBO0lBQ0k7UUFDSSxZQUFZO1FBQ1osYUFBYTtRQUNiLGdCQUFnQjtJQUNwQjtJQUNBO1FBQ0ksWUFBWTtRQUNaLFlBQVk7SUFDaEI7SUFDQTtRQUNJLGVBQWU7SUFDbkI7SUFDQTtRQUNJLGVBQWU7UUFDZixnQkFBZ0I7SUFDcEI7QUFDSjs7QUFFQTtJQUNJO1FBQ0ksWUFBWTtRQUNaLGFBQWE7UUFDYixnQkFBZ0I7SUFDcEI7SUFDQTtRQUNJLFlBQVk7UUFDWixZQUFZO0lBQ2hCO0lBQ0E7UUFDSSxlQUFlO0lBQ25CO0FBQ0o7O0FBRUE7SUFDSTtRQUNJLGNBQWM7UUFDZCxtQkFBbUI7SUFDdkI7QUFDSiIsImZpbGUiOiJzcmMvYXBwL2JvZHktYmxvY2tzL3BvcHVsYXItY29sbGVjdGlvbi1ibG9jay9wb3B1bGFyLWNvbGxlY3Rpb24tYmxvY2suY29tcG9uZW50LmNzcyIsInNvdXJjZXNDb250ZW50IjpbIi5wb3B1bGFyLWNvbnRhaW5lciB7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiB0cmFuc3BhcmVudDtcclxuICAgIHBhZGRpbmc6IDcwcHggMTBweDtcclxuICAgIHRleHQtYWxpZ246IGNlbnRlcjtcclxufVxyXG5cclxuLnBvcHVsYXItaXRlbSB7XHJcbiAgICBtYXJnaW4tYm90dG9tOiAzcHg7XHJcbn1cclxuXHJcbi5wb3B1bGFyLWNhcmQge1xyXG4gICAgd2lkdGg6IDI1MHB4O1xyXG4gICAgaGVpZ2h0OiAyNzBweDtcclxuICAgIG1hcmdpbi1sZWZ0OiAyMHB4O1xyXG4gICAgYmFja2dyb3VuZDogbGluZWFyLWdyYWRpZW50KHRvIGxlZnQsICNlZGVkZWRiOCA1MCUsIGJlaWdlIDUwJSk7XHJcbiAgICBiYWNrZ3JvdW5kLXNpemU6IDIwMCUgMTAwJTtcclxuICAgIGJhY2tncm91bmQtcG9zaXRpb246IHJpZ2h0IGJvdHRvbTtcclxuICAgIHRyYW5zaXRpb246IGFsbCAwLjJzIGVhc2U7XHJcbiAgICB0cmFuc2l0aW9uLWRlbGF5OiAwLjJzO1xyXG59XHJcblxyXG4ucG9wdWxhci1jYXJkOmhvdmVyIHtcclxuICAgIGJhY2tncm91bmQtcG9zaXRpb246IGxlZnQgYm90dG9tO1xyXG4gICAgYm94LXNoYWRvdzogMCAycHggNXB4IDAgcmdiYSgwLCAwLCAwLCAwLjI4KSwgMCAycHggMTBweCAwIHJnYmEoMCwgMCwgMCwgMC4yOSk7XHJcbn1cclxuXHJcbi5ibG9jay10aXRsZSB7XHJcbiAgICBwb3NpdGlvbjogcmVsYXRpdmU7XHJcbiAgICBmb250LXNpemU6IDIwcHg7XHJcbiAgICBtYXJnaW4tYm90dG9tOiA1cHg7XHJcbn1cclxuXHJcbi5saW5lLXN0YXJzIHtcclxuICAgIHdpZHRoOiAxNTBweDtcclxuICAgIGhlaWdodDogMTBweDtcclxuICAgIG1hcmdpbi1ib3R0b206IDgwcHg7XHJcbiAgICBtYXJnaW4tcmlnaHQ6IDEwcHg7XHJcbn1cclxuXHJcbi52aWV3IHtcclxuICAgIG92ZXJmbG93OiB2aXNpYmxlICFpbXBvcnRhbnQ7XHJcbn1cclxuXHJcbi50eXBlLXRleHQge1xyXG4gICAgY29sb3I6ICNiOWI5YjkgIWltcG9ydGFudDtcclxuICAgIHRleHQtc2hhZG93OiAxcHggMXB4IDFweCBibGFjaywgMXB4IDFweCAxcHggYmxhY2s7XHJcbiAgICBmb250LXNpemU6IDEwcHg7XHJcbiAgICBjdXJzb3I6IHBvaW50ZXI7XHJcbiAgICBmb250LWZhbWlseTogJ0pvc2VmaW4gU2FucycsIHNhbnMtc2VyaWY7XHJcbiAgICBtYXJnaW46IDA7XHJcbn1cclxuXHJcbi5wb3B1bGFyLWNhcmQtYm9keSB7XHJcbiAgICBwb3NpdGlvbjogYWJzb2x1dGU7XHJcbiAgICBmbGV4OiAxIDEgYXV0bztcclxuICAgIHdpZHRoOiAyNTBweDtcclxuICAgIGJvdHRvbTogMHB4O1xyXG4gICAgaGVpZ2h0OiA3MHB4O1xyXG4gICAgcGFkZGluZy10b3A6IDVweDtcclxuICAgIGJhY2tncm91bmQ6ICMwMDAwMDBhNjtcclxuICAgIGNvbG9yOiB3aGl0ZTtcclxuICAgIGJveC1zaGFkb3c6IDAgMnB4IDVweCAwIHJnYmEoMCwgMCwgMCwgLjE2KSwgMCAycHggMTBweCAwIHJnYmEoMCwgMCwgMCwgLjEyKTtcclxufVxyXG5cclxuLmNhcmQtdGV4dCB7XHJcbiAgICBmb250LXNpemU6IDE1cHg7XHJcbn1cclxuXHJcbi5jYXJkLXRpdGxlIHtcclxuICAgIHBhZGRpbmc6IDA7XHJcbiAgICBmb250LXNpemU6IDIycHg7XHJcbiAgICBmb250LWZhbWlseTogbm9uZTtcclxuICAgIG1hcmdpbjogMDtcclxuICAgIGN1cnNvcjogcG9pbnRlcjtcclxufVxyXG5cclxuLmNhcmQtZm9yd2FyZCB7XHJcbiAgICBmb250LXNpemU6IDIwcHg7XHJcbiAgICBmb250LXdlaWdodDogYm9sZGVyO1xyXG4gICAgY29sb3I6IHdoaXRlO1xyXG4gICAgLyogdGV4dC1kZWNvcmF0aW9uOiB1bmRlcmxpbmU7ICovXHJcbiAgICBmb250LWZhbWlseTogbm9uZTtcclxuICAgIGN1cnNvcjogcG9pbnRlcjtcclxufVxyXG5cclxuXHJcbi8qIFRvIG1ha2UgY2FyZHMgYXBwZWFyIHNtYWxsIGFzIHNjcmVlbiBnb2VzIHNtYWxsICovXHJcblxyXG5AbWVkaWEgb25seSBzY3JlZW4gYW5kIChtYXgtd2lkdGg6IDEyMDBweCkgYW5kIChtaW4td2lkdGg6IDEwNTBweCkge1xyXG4gICAgLnBvcHVsYXItY2FyZCB7XHJcbiAgICAgICAgd2lkdGg6IDI1MHB4O1xyXG4gICAgICAgIGhlaWdodDogMjcwcHg7XHJcbiAgICAgICAgbWFyZ2luLWxlZnQ6IDVweDtcclxuICAgIH1cclxufVxyXG5cclxuQG1lZGlhIG9ubHkgc2NyZWVuIGFuZCAobWF4LXdpZHRoOiAxMDUwcHgpIGFuZCAobWluLXdpZHRoOiA4NTBweCkge1xyXG4gICAgLnBvcHVsYXItY2FyZCB7XHJcbiAgICAgICAgd2lkdGg6IDIwMHB4O1xyXG4gICAgICAgIGhlaWdodDogMjkwcHg7XHJcbiAgICAgICAgbWFyZ2luLWxlZnQ6IDVweDtcclxuICAgIH1cclxuICAgIC5wb3B1bGFyLWNhcmQtYm9keSB7XHJcbiAgICAgICAgd2lkdGg6IDIwMHB4O1xyXG4gICAgICAgIGhlaWdodDogNTVweDtcclxuICAgIH1cclxuICAgIC5jYXJkLXRpdGxlIHtcclxuICAgICAgICBmb250LXNpemU6IDE2cHg7XHJcbiAgICB9XHJcbiAgICAuY2FyZC10ZXh0IHtcclxuICAgICAgICBmb250LXNpemU6IDEycHg7XHJcbiAgICAgICAgbWFyZ2luLXRvcDogLTRweDtcclxuICAgIH1cclxufVxyXG5cclxuQG1lZGlhIG9ubHkgc2NyZWVuIGFuZCAobWF4LXdpZHRoOiA4NTBweCkgYW5kIChtaW4td2lkdGg6IDc2OHB4KSB7XHJcbiAgICAucG9wdWxhci1jYXJkIHtcclxuICAgICAgICB3aWR0aDogMTgwcHg7XHJcbiAgICAgICAgaGVpZ2h0OiAyOTBweDtcclxuICAgICAgICBtYXJnaW4tbGVmdDogNXB4O1xyXG4gICAgfVxyXG4gICAgLnBvcHVsYXItY2FyZC1ib2R5IHtcclxuICAgICAgICB3aWR0aDogMTgwcHg7XHJcbiAgICAgICAgaGVpZ2h0OiA1NXB4O1xyXG4gICAgfVxyXG4gICAgLmNhcmQtdGl0bGUge1xyXG4gICAgICAgIGZvbnQtc2l6ZTogMTZweDtcclxuICAgIH1cclxufVxyXG5cclxuQG1lZGlhIG9ubHkgc2NyZWVuIGFuZCAobWF4LXdpZHRoOiA3NjhweCkge1xyXG4gICAgLnBvcHVsYXItY2FyZCB7XHJcbiAgICAgICAgbWFyZ2luOiAwIGF1dG87XHJcbiAgICAgICAgbWFyZ2luLWJvdHRvbTogMjBweDtcclxuICAgIH1cclxufSJdfQ== */"] });
/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵsetClassMetadata"](PopularCollectionBlockComponent, [{
        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"],
        args: [{
                selector: 'app-popular-collection-block',
                templateUrl: './popular-collection-block.component.html',
                styleUrls: ['./popular-collection-block.component.css']
            }]
    }], function () { return []; }, { popularCollections: [{
            type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"]
        }] }); })();


/***/ }),

/***/ "./src/app/headers/bottom-header/bottom-header.component.ts":
/*!******************************************************************!*\
  !*** ./src/app/headers/bottom-header/bottom-header.component.ts ***!
  \******************************************************************/
/*! exports provided: BottomHeaderComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BottomHeaderComponent", function() { return BottomHeaderComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var src_app_models_header_options_model__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! src/app/models/header_options.model */ "./src/app/models/header_options.model.ts");
/* harmony import */ var angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! angular-bootstrap-md */ "./node_modules/angular-bootstrap-md/__ivy_ngcc__/fesm2015/angular-bootstrap-md.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/__ivy_ngcc__/fesm2015/common.js");





function BottomHeaderComponent_ul_20_li_5_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "li", 26);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "a", 25);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const option_r12 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](option_r12);
} }
function BottomHeaderComponent_ul_20_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "ul", 15);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "li", 24);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "a", 25);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](4, "hr", 16);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](5, BottomHeaderComponent_ul_20_li_5_Template, 3, 1, "li", 17);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const item_r10 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](item_r10.name);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", item_r10.options);
} }
function BottomHeaderComponent_ul_28_li_5_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "li", 26);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "a", 25);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const option_r15 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](option_r15);
} }
function BottomHeaderComponent_ul_28_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "ul", 15);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "li", 24);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "a", 25);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](4, "hr", 16);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](5, BottomHeaderComponent_ul_28_li_5_Template, 3, 1, "li", 17);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const item_r13 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](item_r13.name);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", item_r13.options);
} }
function BottomHeaderComponent_li_38_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "li", 26);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "a", 25);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const option_r16 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](option_r16);
} }
function BottomHeaderComponent_li_48_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "li", 26);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "a", 25);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const option_r17 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](option_r17);
} }
class BottomHeaderComponent {
    constructor(render) {
        this.render = render;
        this.activeHeader = 'home';
        this.hoveredHeader = 'home';
        this.optionsOpened = false;
    }
    ngOnInit() {
        this.women = [new src_app_models_header_options_model__WEBPACK_IMPORTED_MODULE_1__["HeaderOption"]('Necklaces', ['Necklace Sets', 'Patta Sets', 'Mangalsutras', 'Plain Chains', 'Fancy Chains', 'Pendant Sets', 'Pendants']),
            new src_app_models_header_options_model__WEBPACK_IMPORTED_MODULE_1__["HeaderOption"]('Bangles', ['Arm Bracelets (Baju Bandh)', 'Bracelets', 'Bangle/Bracelet', 'Finger Bracelets', 'Set of Bangles', 'Kara']),
            new src_app_models_header_options_model__WEBPACK_IMPORTED_MODULE_1__["HeaderOption"]('Earrings', ['Chandbali', 'Clipons', 'Hoops', 'Jumkha', 'Long Drops', 'Sui Dhaga', 'Tops']),
            new src_app_models_header_options_model__WEBPACK_IMPORTED_MODULE_1__["HeaderOption"]('Rings', ['GIA Certified Solitaire', 'Fancy Rings', 'Bands', 'Designer Bands']),
            new src_app_models_header_options_model__WEBPACK_IMPORTED_MODULE_1__["HeaderOption"]('Accessories', ['Anklets (Payal)', 'Maang Tikka', 'Nosepins', 'Sahara', 'Waist Band', 'Broach']),
            new src_app_models_header_options_model__WEBPACK_IMPORTED_MODULE_1__["HeaderOption"]('Hot Deals', ['Online Deals', 'Deal of the Day'])];
        this.men = [new src_app_models_header_options_model__WEBPACK_IMPORTED_MODULE_1__["HeaderOption"]('Rings', ['Plain Bands', 'Designer Bands', 'Fancy']),
            new src_app_models_header_options_model__WEBPACK_IMPORTED_MODULE_1__["HeaderOption"]('Bracelets', ['Kara', 'Fancy Bracelets']),
            new src_app_models_header_options_model__WEBPACK_IMPORTED_MODULE_1__["HeaderOption"]('Chains', ['Fancy Chains'])];
        this.kids = ['Bangles', 'Bracelets', 'Earrings', 'Chains', 'Pendents', 'Rings'];
        this.collections = ['Rangoli Collections', 'Utsava Collections', 'Dussera Collections', 'Diwali Collections'];
    }
    setHovered(status) {
        this.hoveredHeader = status;
        const optionstab = document.getElementsByClassName('mega-dropdown-menu');
        if (status !== 'home') {
            if (status === 'womens') {
                this.render.setProperty(optionstab[0], 'style', 'left: 0px; margin-left: 0px');
            }
            else {
                let tab = (status === 'mens') ? 1 : (status === 'kids') ? 2 : 3;
                this.render.setProperty(optionstab[tab], 'style', 'margin-left: -1px');
            }
            this.optionsOpened = true;
        }
    }
    removeHovered(status) {
        this.hoveredHeader = 'home';
        const optionstab = document.getElementsByClassName('mega-dropdown-menu');
        if (status !== 'home') {
            if (status === 'womens') {
                this.render.setProperty(optionstab[0], 'style', 'left: 0px; margin-left: 0px;');
            }
            else {
                let tab = (status === 'mens') ? 1 : (status === 'kids') ? 2 : 3;
                this.render.setProperty(optionstab[tab], 'style', '');
            }
            this.optionsOpened = false;
        }
    }
    openOrCloseOptions(status) {
        const optionstab = document.getElementsByClassName('mega-dropdown-menu');
        if (status !== 'home') {
            if (status === 'womens' && this.optionsOpened) {
                this.render.setProperty(optionstab[0], 'style', 'height: 0px; left: 0px; margin-left: 0px;');
            }
            else if (this.optionsOpened) {
                let tab = (status === 'mens') ? 1 : (status === 'kids') ? 2 : 3;
                this.render.setProperty(optionstab[tab], 'style', 'height: 0px;');
            }
            if (status === 'womens' && !this.optionsOpened) {
                this.render.setProperty(optionstab[0], 'style', 'left: 0px; margin-left: 0px;');
            }
            else if (!this.optionsOpened) {
                let tab = (status === 'mens') ? 1 : (status === 'kids') ? 2 : 3;
                this.render.setProperty(optionstab[tab], 'style', 'margin-left: -1px');
            }
            this.optionsOpened = !this.optionsOpened;
        }
    }
}
BottomHeaderComponent.ɵfac = function BottomHeaderComponent_Factory(t) { return new (t || BottomHeaderComponent)(_angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdirectiveInject"](_angular_core__WEBPACK_IMPORTED_MODULE_0__["Renderer2"])); };
BottomHeaderComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: BottomHeaderComponent, selectors: [["app-bottom-header"]], decls: 56, vars: 15, consts: [[1, "container", "bottom-header-container"], [1, "row"], [1, "col-md-12", "header-items"], ["SideClass", "navbar navbar-expand-lg navbar-dark bottom-header-color", 1, "bottom-header-mdb", 3, "containerInside"], ["href", "#", 1, "navbar-brand"], ["id", "logo", "src", "assets/logo.png"], [1, "navbar-nav", "mr-auto"], [1, "nav-item", "nav-bar-item"], ["mdbWavesEffect", "", 1, "nav-link", "var-colors", "waves-light", 3, "mouseover", "mouseleave"], [1, "underline"], ["mdbWavesEffect", "", 1, "nav-link", "var-colors", "waves-light", 3, "mouseover", "mouseleave", "click"], ["fas", "", "icon", "angle-down"], ["id", "hovered-options", 1, "mega-dropdown-menu", "list-unstyled"], [1, "mega_list"], ["class", "list-unstyled options-list", 4, "ngFor", "ngForOf"], [1, "list-unstyled", "options-list"], [1, "options-head-div"], ["class", "option-items", 4, "ngFor", "ngForOf"], [1, "navbar-nav", "ml-auto", "nav-flex-icons"], [1, "nav-item"], [1, "nav-link", "var-colors-icons"], ["fas", "", "icon", "heart", 1, "shop-icon"], [1, "nav-link", "var-colors-icons", "var-colors-icons-last"], ["fas", "", "icon", "shopping-bag", 1, "shop-icon"], [1, "option-item-head"], ["href", ""], [1, "option-items"]], template: function BottomHeaderComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div", 0);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "div", 1);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "div", 2);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](3, "div", 1);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](4, "mdb-navbar", 3);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](5, "a", 4);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](6, "img", 5);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](7, "links");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](8, "ul", 6);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](9, "li", 7);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](10, "a", 8);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵlistener"]("mouseover", function BottomHeaderComponent_Template_a_mouseover_10_listener() { return ctx.setHovered("home"); })("mouseleave", function BottomHeaderComponent_Template_a_mouseleave_10_listener() { return ctx.removeHovered("home"); });
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](11, "HOME ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](12, "span", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](13, "li", 7);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](14, "a", 10);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵlistener"]("mouseover", function BottomHeaderComponent_Template_a_mouseover_14_listener() { return ctx.setHovered("womens"); })("mouseleave", function BottomHeaderComponent_Template_a_mouseleave_14_listener() { return ctx.removeHovered("womens"); })("click", function BottomHeaderComponent_Template_a_click_14_listener() { return ctx.openOrCloseOptions("womens"); });
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](15, "WOMENS ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](16, "mdb-icon", 11);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](17, "span", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](18, "ul", 12);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](19, "li", 13);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](20, BottomHeaderComponent_ul_20_Template, 6, 2, "ul", 14);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](21, "li", 7);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](22, "a", 10);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵlistener"]("mouseover", function BottomHeaderComponent_Template_a_mouseover_22_listener() { return ctx.setHovered("mens"); })("mouseleave", function BottomHeaderComponent_Template_a_mouseleave_22_listener() { return ctx.removeHovered("mens"); })("click", function BottomHeaderComponent_Template_a_click_22_listener() { return ctx.openOrCloseOptions("mens"); });
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](23, "MENS ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](24, "mdb-icon", 11);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](25, "span", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](26, "ul", 12);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](27, "li", 13);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](28, BottomHeaderComponent_ul_28_Template, 6, 2, "ul", 14);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](29, "li", 7);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](30, "a", 10);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵlistener"]("mouseover", function BottomHeaderComponent_Template_a_mouseover_30_listener() { return ctx.setHovered("kids"); })("mouseleave", function BottomHeaderComponent_Template_a_mouseleave_30_listener() { return ctx.removeHovered("kids"); })("click", function BottomHeaderComponent_Template_a_click_30_listener() { return ctx.openOrCloseOptions("kids"); });
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](31, "KIDS ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](32, "mdb-icon", 11);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](33, "span", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](34, "ul", 12);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](35, "li", 13);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](36, "ul", 15);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](37, "hr", 16);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](38, BottomHeaderComponent_li_38_Template, 3, 1, "li", 17);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](39, "li", 7);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](40, "a", 10);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵlistener"]("mouseover", function BottomHeaderComponent_Template_a_mouseover_40_listener() { return ctx.setHovered("collections"); })("mouseleave", function BottomHeaderComponent_Template_a_mouseleave_40_listener() { return ctx.removeHovered("collections"); })("click", function BottomHeaderComponent_Template_a_click_40_listener() { return ctx.openOrCloseOptions("collections"); });
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](41, "COLLECTIONS ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](42, "mdb-icon", 11);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](43, "span", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](44, "ul", 12);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](45, "li", 13);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](46, "ul", 15);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](47, "hr", 16);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](48, BottomHeaderComponent_li_48_Template, 3, 1, "li", 17);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](49, "ul", 18);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](50, "li", 19);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](51, "a", 20);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](52, "mdb-icon", 21);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](53, "li", 19);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](54, "a", 22);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](55, "mdb-icon", 23);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    } if (rf & 2) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](4);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("containerInside", false);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](8);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵclassProp"]("ul-active", ctx.hoveredHeader == "home");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](5);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵclassProp"]("ul-active", ctx.hoveredHeader == "womens");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", ctx.women);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](5);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵclassProp"]("ul-active", ctx.hoveredHeader == "mens");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", ctx.men);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](5);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵclassProp"]("ul-active", ctx.hoveredHeader == "kids");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](5);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", ctx.kids);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](5);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵclassProp"]("ul-active", ctx.hoveredHeader == "collections");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](5);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", ctx.collections);
    } }, directives: [angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["NavbarComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["LinksComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["WavesDirective"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["MdbIconComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_2__["FasDirective"], _angular_common__WEBPACK_IMPORTED_MODULE_3__["NgForOf"]], styles: [".bottom-header-mdb[_ngcontent-%COMP%] {\r\n    width: 100%;\r\n}\r\n\r\n.bottom-header-container[_ngcontent-%COMP%] {\r\n    margin: 0;\r\n    max-width: 100%;\r\n    padding: 20px 0px 5px 5px;\r\n    background-color: #c5981669;\r\n}\r\n\r\n.navbar-brand[_ngcontent-%COMP%] {\r\n    padding-right: 100px;\r\n}\r\n\r\n.var-colors[_ngcontent-%COMP%] {\r\n    color: rgba(0, 0, 0, 1) !important;\r\n    font-family: 'Lexend Giga', sans-serif;\r\n    font-weight: 600 !important;\r\n    font-size: 12px !important;\r\n    padding: 15px 8px !important;\r\n}\r\n\r\n.var-colors-icons[_ngcontent-%COMP%] {\r\n    padding: 0 !important;\r\n    color: black !important;\r\n}\r\n\r\n.shop-icons[_ngcontent-%COMP%] {\r\n    padding: 10px 5px;\r\n    font-size: 20px;\r\n}\r\n\r\n.shop-icon[_ngcontent-%COMP%] {\r\n    padding: 0px 10px;\r\n}\r\n\r\n#logo[_ngcontent-%COMP%]:hover, .shop-icon[_ngcontent-%COMP%]:hover {\r\n    cursor: pointer;\r\n}\r\n\r\n.underline[_ngcontent-%COMP%] {\r\n    background: linear-gradient(45deg, #00bbf3, #fff700);\r\n    border: 0.3px #000000a6 solid;\r\n    width: 0px;\r\n    height: 3px;\r\n    border-radius: 20px;\r\n    display: none;\r\n    -webkit-animation: increase-width 0.1s;\r\n            animation: increase-width 0.1s;\r\n    -webkit-animation-timing-function: ease-in;\r\n            animation-timing-function: ease-in;\r\n    -webkit-animation-fill-mode: forwards;\r\n            animation-fill-mode: forwards;\r\n}\r\n\r\n.ul-active[_ngcontent-%COMP%] {\r\n    display: block;\r\n}\r\n\r\n.nav-bar-item[_ngcontent-%COMP%] {\r\n    padding: 1px;\r\n    background-position: right bottom;\r\n    transition: all 0.3s ease;\r\n}\r\n\r\n.nav-bar-item[_ngcontent-%COMP%]:hover {\r\n    background-position: left bottom;\r\n    background: linear-gradient(90deg, black 50%, #ffffff00 50%);\r\n    background-size: 200% 100%;\r\n    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.28), 0 2px 10px 0 rgba(0, 0, 0, 0.29);\r\n}\r\n\r\n.nav-bar-item[_ngcontent-%COMP%]:hover   .nav-link[_ngcontent-%COMP%] {\r\n    color: white !important;\r\n}\r\n\r\n.mega-dropdown-menu[_ngcontent-%COMP%] {\r\n    display: block !important;\r\n    position: absolute;\r\n    top: 45px;\r\n    left: unset;\r\n    height: 0px;\r\n    width: 100%;\r\n    margin-left: -1px;\r\n    background-color: black;\r\n    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.28), 0 2px 10px 0 rgba(0, 0, 0, 0.29);\r\n    border-radius: 0px 0px 10px 10px;\r\n    z-index: -1;\r\n    overflow-x: auto;\r\n    overflow-y: hidden;\r\n    transition: height 1s ease;\r\n}\r\n\r\n.nav-bar-item[_ngcontent-%COMP%]:hover   .mega-dropdown-menu[_ngcontent-%COMP%] {\r\n    height: 350px;\r\n    z-index: 1000;\r\n    border: 1px #060606b5 solid;\r\n}\r\n\r\n.mega-dropdown-menu[_ngcontent-%COMP%]   .mega_list[_ngcontent-%COMP%] {\r\n    display: inline-flex;\r\n    margin-top: 10px;\r\n    margin-left: 30px;\r\n}\r\n\r\n.mega-dropdown-menu[_ngcontent-%COMP%]   .mega_list[_ngcontent-%COMP%]   .options-list[_ngcontent-%COMP%] {\r\n    margin-right: 16px;\r\n}\r\n\r\n.mega-dropdown-menu[_ngcontent-%COMP%]   .mega_list[_ngcontent-%COMP%]   .options-list[_ngcontent-%COMP%]   .option-item-head[_ngcontent-%COMP%]   a[_ngcontent-%COMP%] {\r\n    font-size: 20px;\r\n    font-weight: 900;\r\n    color: black;\r\n}\r\n\r\n.mega-dropdown-menu[_ngcontent-%COMP%]   .mega_list[_ngcontent-%COMP%]   .options-list[_ngcontent-%COMP%]   .option-items[_ngcontent-%COMP%] {\r\n    min-width: 150px;\r\n    padding: 7px 5px;\r\n}\r\n\r\n.mega-dropdown-menu[_ngcontent-%COMP%]   .mega_list[_ngcontent-%COMP%]   .options-list[_ngcontent-%COMP%]   .option-items[_ngcontent-%COMP%]   a[_ngcontent-%COMP%] {\r\n    font-size: 15px;\r\n    font-weight: 100;\r\n}\r\n\r\n.mega-dropdown-menu[_ngcontent-%COMP%]   .mega_list[_ngcontent-%COMP%]   .options-list[_ngcontent-%COMP%]   .option-item-head[_ngcontent-%COMP%]   a[_ngcontent-%COMP%], .mega-dropdown-menu[_ngcontent-%COMP%]   .mega_list[_ngcontent-%COMP%]   .options-list[_ngcontent-%COMP%]   .option-items[_ngcontent-%COMP%]   a[_ngcontent-%COMP%] {\r\n    font-family: 'Open Sans';\r\n    font-style: normal;\r\n    color: white;\r\n}\r\n\r\n.mega-dropdown-menu[_ngcontent-%COMP%]   .mega_list[_ngcontent-%COMP%]   .options-list[_ngcontent-%COMP%]   .option-items[_ngcontent-%COMP%]:hover   a[_ngcontent-%COMP%] {\r\n    color: black !important;\r\n    font-weight: 900;\r\n}\r\n\r\n.mega-dropdown-menu[_ngcontent-%COMP%]   .mega_list[_ngcontent-%COMP%]   .options-list[_ngcontent-%COMP%]   .option-items[_ngcontent-%COMP%]:hover {\r\n    background-color: #ffe391 !important;\r\n}\r\n\r\n.options-head-div[_ngcontent-%COMP%] {\r\n    min-width: 160px;\r\n    margin: 10px;\r\n    border: 1px beige solid;\r\n}\r\n\r\n@-webkit-keyframes increase-width {\r\n    0% {\r\n        width: 0px;\r\n    }\r\n    100% {\r\n        width: inherit;\r\n    }\r\n}\r\n\r\n@keyframes increase-width {\r\n    0% {\r\n        width: 0px;\r\n    }\r\n    100% {\r\n        width: inherit;\r\n    }\r\n}\r\n\r\n@media only screen and (max-width: 1000px) and (min-width: 992px) {\r\n    .var-colors[_ngcontent-%COMP%] {\r\n        padding: 15px 6px !important;\r\n    }\r\n}\r\n\r\n@media only screen and (max-width: 992px) {\r\n    .mega-dropdown-menu[_ngcontent-%COMP%] {\r\n        top: auto;\r\n        margin-left: -1px;\r\n    }\r\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvaGVhZGVycy9ib3R0b20taGVhZGVyL2JvdHRvbS1oZWFkZXIuY29tcG9uZW50LmNzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtJQUNJLFdBQVc7QUFDZjs7QUFFQTtJQUNJLFNBQVM7SUFDVCxlQUFlO0lBQ2YseUJBQXlCO0lBQ3pCLDJCQUEyQjtBQUMvQjs7QUFFQTtJQUNJLG9CQUFvQjtBQUN4Qjs7QUFFQTtJQUNJLGtDQUFrQztJQUNsQyxzQ0FBc0M7SUFDdEMsMkJBQTJCO0lBQzNCLDBCQUEwQjtJQUMxQiw0QkFBNEI7QUFDaEM7O0FBRUE7SUFDSSxxQkFBcUI7SUFDckIsdUJBQXVCO0FBQzNCOztBQUVBO0lBQ0ksaUJBQWlCO0lBQ2pCLGVBQWU7QUFDbkI7O0FBRUE7SUFDSSxpQkFBaUI7QUFDckI7O0FBRUE7O0lBRUksZUFBZTtBQUNuQjs7QUFFQTtJQUNJLG9EQUFvRDtJQUNwRCw2QkFBNkI7SUFDN0IsVUFBVTtJQUNWLFdBQVc7SUFDWCxtQkFBbUI7SUFDbkIsYUFBYTtJQUNiLHNDQUE4QjtZQUE5Qiw4QkFBOEI7SUFDOUIsMENBQWtDO1lBQWxDLGtDQUFrQztJQUNsQyxxQ0FBNkI7WUFBN0IsNkJBQTZCO0FBQ2pDOztBQUVBO0lBQ0ksY0FBYztBQUNsQjs7QUFFQTtJQUNJLFlBQVk7SUFDWixpQ0FBaUM7SUFDakMseUJBQXlCO0FBQzdCOztBQUVBO0lBQ0ksZ0NBQWdDO0lBQ2hDLDREQUE0RDtJQUM1RCwwQkFBMEI7SUFDMUIsNkVBQTZFO0FBQ2pGOztBQUVBO0lBQ0ksdUJBQXVCO0FBQzNCOztBQUVBO0lBQ0kseUJBQXlCO0lBQ3pCLGtCQUFrQjtJQUNsQixTQUFTO0lBQ1QsV0FBVztJQUNYLFdBQVc7SUFDWCxXQUFXO0lBQ1gsaUJBQWlCO0lBQ2pCLHVCQUF1QjtJQUN2Qiw2RUFBNkU7SUFDN0UsZ0NBQWdDO0lBQ2hDLFdBQVc7SUFDWCxnQkFBZ0I7SUFDaEIsa0JBQWtCO0lBQ2xCLDBCQUEwQjtBQUM5Qjs7QUFFQTtJQUNJLGFBQWE7SUFDYixhQUFhO0lBQ2IsMkJBQTJCO0FBQy9COztBQUVBO0lBQ0ksb0JBQW9CO0lBQ3BCLGdCQUFnQjtJQUNoQixpQkFBaUI7QUFDckI7O0FBRUE7SUFDSSxrQkFBa0I7QUFDdEI7O0FBRUE7SUFDSSxlQUFlO0lBQ2YsZ0JBQWdCO0lBQ2hCLFlBQVk7QUFDaEI7O0FBRUE7SUFDSSxnQkFBZ0I7SUFDaEIsZ0JBQWdCO0FBQ3BCOztBQUVBO0lBQ0ksZUFBZTtJQUNmLGdCQUFnQjtBQUNwQjs7QUFFQTs7SUFFSSx3QkFBd0I7SUFDeEIsa0JBQWtCO0lBQ2xCLFlBQVk7QUFDaEI7O0FBRUE7SUFDSSx1QkFBdUI7SUFDdkIsZ0JBQWdCO0FBQ3BCOztBQUVBO0lBQ0ksb0NBQW9DO0FBQ3hDOztBQUVBO0lBQ0ksZ0JBQWdCO0lBQ2hCLFlBQVk7SUFDWix1QkFBdUI7QUFDM0I7O0FBRUE7SUFDSTtRQUNJLFVBQVU7SUFDZDtJQUNBO1FBQ0ksY0FBYztJQUNsQjtBQUNKOztBQVBBO0lBQ0k7UUFDSSxVQUFVO0lBQ2Q7SUFDQTtRQUNJLGNBQWM7SUFDbEI7QUFDSjs7QUFFQTtJQUNJO1FBQ0ksNEJBQTRCO0lBQ2hDO0FBQ0o7O0FBRUE7SUFDSTtRQUNJLFNBQVM7UUFDVCxpQkFBaUI7SUFDckI7QUFDSiIsImZpbGUiOiJzcmMvYXBwL2hlYWRlcnMvYm90dG9tLWhlYWRlci9ib3R0b20taGVhZGVyLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIuYm90dG9tLWhlYWRlci1tZGIge1xyXG4gICAgd2lkdGg6IDEwMCU7XHJcbn1cclxuXHJcbi5ib3R0b20taGVhZGVyLWNvbnRhaW5lciB7XHJcbiAgICBtYXJnaW46IDA7XHJcbiAgICBtYXgtd2lkdGg6IDEwMCU7XHJcbiAgICBwYWRkaW5nOiAyMHB4IDBweCA1cHggNXB4O1xyXG4gICAgYmFja2dyb3VuZC1jb2xvcjogI2M1OTgxNjY5O1xyXG59XHJcblxyXG4ubmF2YmFyLWJyYW5kIHtcclxuICAgIHBhZGRpbmctcmlnaHQ6IDEwMHB4O1xyXG59XHJcblxyXG4udmFyLWNvbG9ycyB7XHJcbiAgICBjb2xvcjogcmdiYSgwLCAwLCAwLCAxKSAhaW1wb3J0YW50O1xyXG4gICAgZm9udC1mYW1pbHk6ICdMZXhlbmQgR2lnYScsIHNhbnMtc2VyaWY7XHJcbiAgICBmb250LXdlaWdodDogNjAwICFpbXBvcnRhbnQ7XHJcbiAgICBmb250LXNpemU6IDEycHggIWltcG9ydGFudDtcclxuICAgIHBhZGRpbmc6IDE1cHggOHB4ICFpbXBvcnRhbnQ7XHJcbn1cclxuXHJcbi52YXItY29sb3JzLWljb25zIHtcclxuICAgIHBhZGRpbmc6IDAgIWltcG9ydGFudDtcclxuICAgIGNvbG9yOiBibGFjayAhaW1wb3J0YW50O1xyXG59XHJcblxyXG4uc2hvcC1pY29ucyB7XHJcbiAgICBwYWRkaW5nOiAxMHB4IDVweDtcclxuICAgIGZvbnQtc2l6ZTogMjBweDtcclxufVxyXG5cclxuLnNob3AtaWNvbiB7XHJcbiAgICBwYWRkaW5nOiAwcHggMTBweDtcclxufVxyXG5cclxuI2xvZ286aG92ZXIsXHJcbi5zaG9wLWljb246aG92ZXIge1xyXG4gICAgY3Vyc29yOiBwb2ludGVyO1xyXG59XHJcblxyXG4udW5kZXJsaW5lIHtcclxuICAgIGJhY2tncm91bmQ6IGxpbmVhci1ncmFkaWVudCg0NWRlZywgIzAwYmJmMywgI2ZmZjcwMCk7XHJcbiAgICBib3JkZXI6IDAuM3B4ICMwMDAwMDBhNiBzb2xpZDtcclxuICAgIHdpZHRoOiAwcHg7XHJcbiAgICBoZWlnaHQ6IDNweDtcclxuICAgIGJvcmRlci1yYWRpdXM6IDIwcHg7XHJcbiAgICBkaXNwbGF5OiBub25lO1xyXG4gICAgYW5pbWF0aW9uOiBpbmNyZWFzZS13aWR0aCAwLjFzO1xyXG4gICAgYW5pbWF0aW9uLXRpbWluZy1mdW5jdGlvbjogZWFzZS1pbjtcclxuICAgIGFuaW1hdGlvbi1maWxsLW1vZGU6IGZvcndhcmRzO1xyXG59XHJcblxyXG4udWwtYWN0aXZlIHtcclxuICAgIGRpc3BsYXk6IGJsb2NrO1xyXG59XHJcblxyXG4ubmF2LWJhci1pdGVtIHtcclxuICAgIHBhZGRpbmc6IDFweDtcclxuICAgIGJhY2tncm91bmQtcG9zaXRpb246IHJpZ2h0IGJvdHRvbTtcclxuICAgIHRyYW5zaXRpb246IGFsbCAwLjNzIGVhc2U7XHJcbn1cclxuXHJcbi5uYXYtYmFyLWl0ZW06aG92ZXIge1xyXG4gICAgYmFja2dyb3VuZC1wb3NpdGlvbjogbGVmdCBib3R0b207XHJcbiAgICBiYWNrZ3JvdW5kOiBsaW5lYXItZ3JhZGllbnQoOTBkZWcsIGJsYWNrIDUwJSwgI2ZmZmZmZjAwIDUwJSk7XHJcbiAgICBiYWNrZ3JvdW5kLXNpemU6IDIwMCUgMTAwJTtcclxuICAgIGJveC1zaGFkb3c6IDAgMnB4IDVweCAwIHJnYmEoMCwgMCwgMCwgMC4yOCksIDAgMnB4IDEwcHggMCByZ2JhKDAsIDAsIDAsIDAuMjkpO1xyXG59XHJcblxyXG4ubmF2LWJhci1pdGVtOmhvdmVyIC5uYXYtbGluayB7XHJcbiAgICBjb2xvcjogd2hpdGUgIWltcG9ydGFudDtcclxufVxyXG5cclxuLm1lZ2EtZHJvcGRvd24tbWVudSB7XHJcbiAgICBkaXNwbGF5OiBibG9jayAhaW1wb3J0YW50O1xyXG4gICAgcG9zaXRpb246IGFic29sdXRlO1xyXG4gICAgdG9wOiA0NXB4O1xyXG4gICAgbGVmdDogdW5zZXQ7XHJcbiAgICBoZWlnaHQ6IDBweDtcclxuICAgIHdpZHRoOiAxMDAlO1xyXG4gICAgbWFyZ2luLWxlZnQ6IC0xcHg7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiBibGFjaztcclxuICAgIGJveC1zaGFkb3c6IDAgMnB4IDVweCAwIHJnYmEoMCwgMCwgMCwgMC4yOCksIDAgMnB4IDEwcHggMCByZ2JhKDAsIDAsIDAsIDAuMjkpO1xyXG4gICAgYm9yZGVyLXJhZGl1czogMHB4IDBweCAxMHB4IDEwcHg7XHJcbiAgICB6LWluZGV4OiAtMTtcclxuICAgIG92ZXJmbG93LXg6IGF1dG87XHJcbiAgICBvdmVyZmxvdy15OiBoaWRkZW47XHJcbiAgICB0cmFuc2l0aW9uOiBoZWlnaHQgMXMgZWFzZTtcclxufVxyXG5cclxuLm5hdi1iYXItaXRlbTpob3ZlciAubWVnYS1kcm9wZG93bi1tZW51IHtcclxuICAgIGhlaWdodDogMzUwcHg7XHJcbiAgICB6LWluZGV4OiAxMDAwO1xyXG4gICAgYm9yZGVyOiAxcHggIzA2MDYwNmI1IHNvbGlkO1xyXG59XHJcblxyXG4ubWVnYS1kcm9wZG93bi1tZW51IC5tZWdhX2xpc3Qge1xyXG4gICAgZGlzcGxheTogaW5saW5lLWZsZXg7XHJcbiAgICBtYXJnaW4tdG9wOiAxMHB4O1xyXG4gICAgbWFyZ2luLWxlZnQ6IDMwcHg7XHJcbn1cclxuXHJcbi5tZWdhLWRyb3Bkb3duLW1lbnUgLm1lZ2FfbGlzdCAub3B0aW9ucy1saXN0IHtcclxuICAgIG1hcmdpbi1yaWdodDogMTZweDtcclxufVxyXG5cclxuLm1lZ2EtZHJvcGRvd24tbWVudSAubWVnYV9saXN0IC5vcHRpb25zLWxpc3QgLm9wdGlvbi1pdGVtLWhlYWQgYSB7XHJcbiAgICBmb250LXNpemU6IDIwcHg7XHJcbiAgICBmb250LXdlaWdodDogOTAwO1xyXG4gICAgY29sb3I6IGJsYWNrO1xyXG59XHJcblxyXG4ubWVnYS1kcm9wZG93bi1tZW51IC5tZWdhX2xpc3QgLm9wdGlvbnMtbGlzdCAub3B0aW9uLWl0ZW1zIHtcclxuICAgIG1pbi13aWR0aDogMTUwcHg7XHJcbiAgICBwYWRkaW5nOiA3cHggNXB4O1xyXG59XHJcblxyXG4ubWVnYS1kcm9wZG93bi1tZW51IC5tZWdhX2xpc3QgLm9wdGlvbnMtbGlzdCAub3B0aW9uLWl0ZW1zIGEge1xyXG4gICAgZm9udC1zaXplOiAxNXB4O1xyXG4gICAgZm9udC13ZWlnaHQ6IDEwMDtcclxufVxyXG5cclxuLm1lZ2EtZHJvcGRvd24tbWVudSAubWVnYV9saXN0IC5vcHRpb25zLWxpc3QgLm9wdGlvbi1pdGVtLWhlYWQgYSxcclxuLm1lZ2EtZHJvcGRvd24tbWVudSAubWVnYV9saXN0IC5vcHRpb25zLWxpc3QgLm9wdGlvbi1pdGVtcyBhIHtcclxuICAgIGZvbnQtZmFtaWx5OiAnT3BlbiBTYW5zJztcclxuICAgIGZvbnQtc3R5bGU6IG5vcm1hbDtcclxuICAgIGNvbG9yOiB3aGl0ZTtcclxufVxyXG5cclxuLm1lZ2EtZHJvcGRvd24tbWVudSAubWVnYV9saXN0IC5vcHRpb25zLWxpc3QgLm9wdGlvbi1pdGVtczpob3ZlciBhIHtcclxuICAgIGNvbG9yOiBibGFjayAhaW1wb3J0YW50O1xyXG4gICAgZm9udC13ZWlnaHQ6IDkwMDtcclxufVxyXG5cclxuLm1lZ2EtZHJvcGRvd24tbWVudSAubWVnYV9saXN0IC5vcHRpb25zLWxpc3QgLm9wdGlvbi1pdGVtczpob3ZlciB7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiAjZmZlMzkxICFpbXBvcnRhbnQ7XHJcbn1cclxuXHJcbi5vcHRpb25zLWhlYWQtZGl2IHtcclxuICAgIG1pbi13aWR0aDogMTYwcHg7XHJcbiAgICBtYXJnaW46IDEwcHg7XHJcbiAgICBib3JkZXI6IDFweCBiZWlnZSBzb2xpZDtcclxufVxyXG5cclxuQGtleWZyYW1lcyBpbmNyZWFzZS13aWR0aCB7XHJcbiAgICAwJSB7XHJcbiAgICAgICAgd2lkdGg6IDBweDtcclxuICAgIH1cclxuICAgIDEwMCUge1xyXG4gICAgICAgIHdpZHRoOiBpbmhlcml0O1xyXG4gICAgfVxyXG59XHJcblxyXG5AbWVkaWEgb25seSBzY3JlZW4gYW5kIChtYXgtd2lkdGg6IDEwMDBweCkgYW5kIChtaW4td2lkdGg6IDk5MnB4KSB7XHJcbiAgICAudmFyLWNvbG9ycyB7XHJcbiAgICAgICAgcGFkZGluZzogMTVweCA2cHggIWltcG9ydGFudDtcclxuICAgIH1cclxufVxyXG5cclxuQG1lZGlhIG9ubHkgc2NyZWVuIGFuZCAobWF4LXdpZHRoOiA5OTJweCkge1xyXG4gICAgLm1lZ2EtZHJvcGRvd24tbWVudSB7XHJcbiAgICAgICAgdG9wOiBhdXRvO1xyXG4gICAgICAgIG1hcmdpbi1sZWZ0OiAtMXB4O1xyXG4gICAgfVxyXG59Il19 */"] });
/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵsetClassMetadata"](BottomHeaderComponent, [{
        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"],
        args: [{
                selector: 'app-bottom-header',
                templateUrl: './bottom-header.component.html',
                styleUrls: ['./bottom-header.component.css']
            }]
    }], function () { return [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Renderer2"] }]; }, null); })();


/***/ }),

/***/ "./src/app/headers/headers.component.ts":
/*!**********************************************!*\
  !*** ./src/app/headers/headers.component.ts ***!
  \**********************************************/
/*! exports provided: HeadersComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HeadersComponent", function() { return HeadersComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var _top_header_top_header_component__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./top-header/top-header.component */ "./src/app/headers/top-header/top-header.component.ts");
/* harmony import */ var _bottom_header_bottom_header_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./bottom-header/bottom-header.component */ "./src/app/headers/bottom-header/bottom-header.component.ts");




class HeadersComponent {
    constructor() {
    }
    ngOnInit() {
    }
}
HeadersComponent.ɵfac = function HeadersComponent_Factory(t) { return new (t || HeadersComponent)(); };
HeadersComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: HeadersComponent, selectors: [["app-headers"]], decls: 2, vars: 0, template: function HeadersComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](0, "app-top-header");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](1, "app-bottom-header");
    } }, directives: [_top_header_top_header_component__WEBPACK_IMPORTED_MODULE_1__["TopHeaderComponent"], _bottom_header_bottom_header_component__WEBPACK_IMPORTED_MODULE_2__["BottomHeaderComponent"]], styles: ["\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2hlYWRlcnMvaGVhZGVycy5jb21wb25lbnQuY3NzIn0= */"] });
/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵsetClassMetadata"](HeadersComponent, [{
        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"],
        args: [{
                selector: 'app-headers',
                templateUrl: './headers.component.html',
                styleUrls: ['./headers.component.css']
            }]
    }], function () { return []; }, null); })();


/***/ }),

/***/ "./src/app/headers/top-header/top-header.component.ts":
/*!************************************************************!*\
  !*** ./src/app/headers/top-header/top-header.component.ts ***!
  \************************************************************/
/*! exports provided: TopHeaderComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TopHeaderComponent", function() { return TopHeaderComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! angular-bootstrap-md */ "./node_modules/angular-bootstrap-md/__ivy_ngcc__/fesm2015/angular-bootstrap-md.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/__ivy_ngcc__/fesm2015/common.js");




function TopHeaderComponent_div_30_Template(rf, ctx) { if (rf & 1) {
    const _r3 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵgetCurrentView"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div", 16);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "mdb-icon", 17);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵlistener"]("click", function TopHeaderComponent_div_30_Template_mdb_icon_click_1_listener() { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵrestoreView"](_r3); const ctx_r2 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵnextContext"](); return ctx_r2.closeBoxes(); });
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](2, "input", 18);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](3, "br");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](4, "input", 19);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](5, "br");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](6, "button", 20);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](7, "Login");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} }
function TopHeaderComponent_div_31_Template(rf, ctx) { if (rf & 1) {
    const _r5 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵgetCurrentView"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div", 21);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "mdb-icon", 17);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵlistener"]("click", function TopHeaderComponent_div_31_Template_mdb_icon_click_1_listener() { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵrestoreView"](_r5); const ctx_r4 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵnextContext"](); return ctx_r4.closeBoxes(); });
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](2, "input", 18);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](3, "br");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](4, "input", 22);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](5, "br");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](6, "input", 23);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](7, "br");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](8, "input", 24);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](9, "br");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](10, "input", 25);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](11, "br");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](12, "input", 26);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](13, "br");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](14, "button", 20);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](15, "Register");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} }
class TopHeaderComponent {
    constructor() {
        this.loginBoxStatus = false;
        this.registerBoxStatus = false;
    }
    ngOnInit() {
    }
    openLoginBox(status) {
        this.loginBoxStatus = status;
        this.registerBoxStatus = false;
    }
    openRegisterBox(status) {
        this.registerBoxStatus = status;
        this.loginBoxStatus = false;
    }
    closeBoxes() {
        this.loginBoxStatus = false;
        this.registerBoxStatus = false;
    }
}
TopHeaderComponent.ɵfac = function TopHeaderComponent_Factory(t) { return new (t || TopHeaderComponent)(); };
TopHeaderComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: TopHeaderComponent, selectors: [["app-top-header"]], decls: 32, vars: 3, consts: [["SideClass", "navbar navbar-expand-lg navbar-dark top-header-color", 3, "containerInside"], [1, "navbar-nav", "mr-auto"], [1, "nav-item"], ["mdbWavesEffect", "", 1, "nav-link", "waves-light", "var-colors"], ["fas", "", "icon", "map-marker-alt"], ["fas", "", "icon", "phone-square-alt"], ["href", "tel:+1-303-499-7111", 1, "tel"], [1, "navbar-nav", "ml-auto", "nav-flex-icons"], [1, "nav-item", 3, "mouseover"], [1, "nav-link", "var-colors"], ["fab", "", "icon", "facebook"], ["fab", "", "icon", "twitter"], ["fab", "", "icon", "instagram"], [1, "box-wpr"], ["class", "popup-box", "id", "login-box", 4, "ngIf"], ["class", "popup-box", "id", "register-box", 4, "ngIf"], ["id", "login-box", 1, "popup-box"], ["fas", "", "icon", "times-circle", 1, "close-box", 3, "click"], ["type", "text", "name", "userName", "placeholder", "Username", 1, "form-control"], ["type", "password", "name", "password", "placeholder", "Password", 1, "form-control"], ["type", "button", 1, "btn", "btn-outline-warning", "top-header-btn"], ["id", "register-box", 1, "popup-box"], ["type", "text", "name", "firstName", "placeholder", "First Name", 1, "form-control"], ["type", "text", "name", "lastName", "placeholder", "Last Name", 1, "form-control"], ["type", "text", "name", "email", "placeholder", "email", 1, "form-control"], ["type", "password", "name", "password", "placeholder", "password", 1, "form-control"], ["type", "password", "name", "repassword", "placeholder", "Reenter password", 1, "form-control"]], template: function TopHeaderComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "mdb-navbar", 0);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "links");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "ul", 1);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](3, "li", 2);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](4, "a", 3);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](5, "mdb-icon", 4);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](6, " Store ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](7, "li", 2);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](8, "a", 3);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](9, "mdb-icon", 5);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](10, " Phone ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](11, "a", 6);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](12, "+1 (303) 499-7111");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](13, "ul", 7);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](14, "li", 8);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵlistener"]("mouseover", function TopHeaderComponent_Template_li_mouseover_14_listener() { return ctx.openLoginBox(true); });
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](15, "a", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](16, " Login ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](17, "li", 8);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵlistener"]("mouseover", function TopHeaderComponent_Template_li_mouseover_17_listener() { return ctx.openRegisterBox(true); });
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](18, "a", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](19, " Register ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](20, "li", 2);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](21, "a", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](22, "mdb-icon", 10);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](23, "li", 2);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](24, "a", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](25, "mdb-icon", 11);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](26, "li", 2);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](27, "a", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](28, "mdb-icon", 12);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](29, "div", 13);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](30, TopHeaderComponent_div_30_Template, 8, 0, "div", 14);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](31, TopHeaderComponent_div_31_Template, 16, 0, "div", 15);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    } if (rf & 2) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("containerInside", false);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](30);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngIf", ctx.loginBoxStatus);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](1);
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngIf", ctx.registerBoxStatus);
    } }, directives: [angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_1__["NavbarComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_1__["LinksComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_1__["WavesDirective"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_1__["MdbIconComponent"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_1__["FasDirective"], angular_bootstrap_md__WEBPACK_IMPORTED_MODULE_1__["FabDirective"], _angular_common__WEBPACK_IMPORTED_MODULE_2__["NgIf"]], styles: [".var-colors[_ngcontent-%COMP%] {\r\n    font-family: 'Josefin Sans', sans-serif;\r\n    color: black !important;\r\n    font-size: 12px !important;\r\n    font-weight: 600 !important;\r\n}\r\n\r\n.tel[_ngcontent-%COMP%] {\r\n    margin-left: 5px;\r\n}\r\n\r\n.var-colors[_ngcontent-%COMP%]:hover {\r\n    color: grey !important;\r\n}\r\n\r\n.popup-box[_ngcontent-%COMP%] {\r\n    position: absolute;\r\n    top: 50px;\r\n    right: 10px;\r\n    padding: 25px 30px;\r\n    border: 1px #a0a0a0 solid;\r\n    background-color: #56565670;\r\n    z-index: 100;\r\n}\r\n\r\n#login-box[_ngcontent-%COMP%] {\r\n    width: 350px;\r\n    height: 200px;\r\n}\r\n\r\n#register-box[_ngcontent-%COMP%] {\r\n    width: 350px;\r\n    height: 450px;\r\n}\r\n\r\n.box-wpr[_ngcontent-%COMP%]   .popup-box[_ngcontent-%COMP%] {\r\n    -webkit-animation: boxPosition 0.5s;\r\n            animation: boxPosition 0.5s;\r\n    -webkit-animation-timing-function: ease-in;\r\n            animation-timing-function: ease-in;\r\n    -webkit-animation-fill-mode: forwards;\r\n            animation-fill-mode: forwards;\r\n}\r\n\r\n.close-box[_ngcontent-%COMP%] {\r\n    position: absolute;\r\n    top: 10px;\r\n    right: 10px;\r\n    color: white;\r\n}\r\n\r\n.popup-box[_ngcontent-%COMP%]:hover {\r\n    background-color: #565656c9;\r\n    box-shadow: 9px 10px 20px 0px #2d2d2d;\r\n}\r\n\r\n.login[_ngcontent-%COMP%]:hover, .register[_ngcontent-%COMP%]:hover, .close-box[_ngcontent-%COMP%]:hover {\r\n    cursor: pointer;\r\n}\r\n\r\n.close-box[_ngcontent-%COMP%]:hover {\r\n    -webkit-animation: close-box-colorIncr 0.2s;\r\n            animation: close-box-colorIncr 0.2s;\r\n    -webkit-animation-timing-function: ease-in;\r\n            animation-timing-function: ease-in;\r\n    -webkit-animation-fill-mode: both;\r\n            animation-fill-mode: both;\r\n}\r\n\r\n.top-header-btn[_ngcontent-%COMP%] {\r\n    font-size: 13px;\r\n    padding: 8px 25px;\r\n    letter-spacing: 1px;\r\n    margin-top: -5px;\r\n    font-weight: 600;\r\n}\r\n\r\n.top-header-btn[_ngcontent-%COMP%]:hover {\r\n    background-color: black !important;\r\n}\r\n\r\n@-webkit-keyframes boxPosition {\r\n    from {\r\n        opacity: 0.2;\r\n    }\r\n    to {\r\n        opacity: 1;\r\n        top: 30px;\r\n    }\r\n}\r\n\r\n@keyframes boxPosition {\r\n    from {\r\n        opacity: 0.2;\r\n    }\r\n    to {\r\n        opacity: 1;\r\n        top: 30px;\r\n    }\r\n}\r\n\r\n@-webkit-keyframes close-box-colorIncr {\r\n    100% {\r\n        color: black;\r\n    }\r\n}\r\n\r\n@keyframes close-box-colorIncr {\r\n    100% {\r\n        color: black;\r\n    }\r\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvaGVhZGVycy90b3AtaGVhZGVyL3RvcC1oZWFkZXIuY29tcG9uZW50LmNzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtJQUNJLHVDQUF1QztJQUN2Qyx1QkFBdUI7SUFDdkIsMEJBQTBCO0lBQzFCLDJCQUEyQjtBQUMvQjs7QUFFQTtJQUNJLGdCQUFnQjtBQUNwQjs7QUFFQTtJQUNJLHNCQUFzQjtBQUMxQjs7QUFFQTtJQUNJLGtCQUFrQjtJQUNsQixTQUFTO0lBQ1QsV0FBVztJQUNYLGtCQUFrQjtJQUNsQix5QkFBeUI7SUFDekIsMkJBQTJCO0lBQzNCLFlBQVk7QUFDaEI7O0FBRUE7SUFDSSxZQUFZO0lBQ1osYUFBYTtBQUNqQjs7QUFFQTtJQUNJLFlBQVk7SUFDWixhQUFhO0FBQ2pCOztBQUVBO0lBQ0ksbUNBQTJCO1lBQTNCLDJCQUEyQjtJQUMzQiwwQ0FBa0M7WUFBbEMsa0NBQWtDO0lBQ2xDLHFDQUE2QjtZQUE3Qiw2QkFBNkI7QUFDakM7O0FBRUE7SUFDSSxrQkFBa0I7SUFDbEIsU0FBUztJQUNULFdBQVc7SUFDWCxZQUFZO0FBQ2hCOztBQUVBO0lBQ0ksMkJBQTJCO0lBQzNCLHFDQUFxQztBQUN6Qzs7QUFFQTs7O0lBR0ksZUFBZTtBQUNuQjs7QUFFQTtJQUNJLDJDQUFtQztZQUFuQyxtQ0FBbUM7SUFDbkMsMENBQWtDO1lBQWxDLGtDQUFrQztJQUNsQyxpQ0FBeUI7WUFBekIseUJBQXlCO0FBQzdCOztBQUVBO0lBQ0ksZUFBZTtJQUNmLGlCQUFpQjtJQUNqQixtQkFBbUI7SUFDbkIsZ0JBQWdCO0lBQ2hCLGdCQUFnQjtBQUNwQjs7QUFFQTtJQUNJLGtDQUFrQztBQUN0Qzs7QUFFQTtJQUNJO1FBQ0ksWUFBWTtJQUNoQjtJQUNBO1FBQ0ksVUFBVTtRQUNWLFNBQVM7SUFDYjtBQUNKOztBQVJBO0lBQ0k7UUFDSSxZQUFZO0lBQ2hCO0lBQ0E7UUFDSSxVQUFVO1FBQ1YsU0FBUztJQUNiO0FBQ0o7O0FBRUE7SUFDSTtRQUNJLFlBQVk7SUFDaEI7QUFDSjs7QUFKQTtJQUNJO1FBQ0ksWUFBWTtJQUNoQjtBQUNKIiwiZmlsZSI6InNyYy9hcHAvaGVhZGVycy90b3AtaGVhZGVyL3RvcC1oZWFkZXIuY29tcG9uZW50LmNzcyIsInNvdXJjZXNDb250ZW50IjpbIi52YXItY29sb3JzIHtcclxuICAgIGZvbnQtZmFtaWx5OiAnSm9zZWZpbiBTYW5zJywgc2Fucy1zZXJpZjtcclxuICAgIGNvbG9yOiBibGFjayAhaW1wb3J0YW50O1xyXG4gICAgZm9udC1zaXplOiAxMnB4ICFpbXBvcnRhbnQ7XHJcbiAgICBmb250LXdlaWdodDogNjAwICFpbXBvcnRhbnQ7XHJcbn1cclxuXHJcbi50ZWwge1xyXG4gICAgbWFyZ2luLWxlZnQ6IDVweDtcclxufVxyXG5cclxuLnZhci1jb2xvcnM6aG92ZXIge1xyXG4gICAgY29sb3I6IGdyZXkgIWltcG9ydGFudDtcclxufVxyXG5cclxuLnBvcHVwLWJveCB7XHJcbiAgICBwb3NpdGlvbjogYWJzb2x1dGU7XHJcbiAgICB0b3A6IDUwcHg7XHJcbiAgICByaWdodDogMTBweDtcclxuICAgIHBhZGRpbmc6IDI1cHggMzBweDtcclxuICAgIGJvcmRlcjogMXB4ICNhMGEwYTAgc29saWQ7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiAjNTY1NjU2NzA7XHJcbiAgICB6LWluZGV4OiAxMDA7XHJcbn1cclxuXHJcbiNsb2dpbi1ib3gge1xyXG4gICAgd2lkdGg6IDM1MHB4O1xyXG4gICAgaGVpZ2h0OiAyMDBweDtcclxufVxyXG5cclxuI3JlZ2lzdGVyLWJveCB7XHJcbiAgICB3aWR0aDogMzUwcHg7XHJcbiAgICBoZWlnaHQ6IDQ1MHB4O1xyXG59XHJcblxyXG4uYm94LXdwciAucG9wdXAtYm94IHtcclxuICAgIGFuaW1hdGlvbjogYm94UG9zaXRpb24gMC41cztcclxuICAgIGFuaW1hdGlvbi10aW1pbmctZnVuY3Rpb246IGVhc2UtaW47XHJcbiAgICBhbmltYXRpb24tZmlsbC1tb2RlOiBmb3J3YXJkcztcclxufVxyXG5cclxuLmNsb3NlLWJveCB7XHJcbiAgICBwb3NpdGlvbjogYWJzb2x1dGU7XHJcbiAgICB0b3A6IDEwcHg7XHJcbiAgICByaWdodDogMTBweDtcclxuICAgIGNvbG9yOiB3aGl0ZTtcclxufVxyXG5cclxuLnBvcHVwLWJveDpob3ZlciB7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiAjNTY1NjU2Yzk7XHJcbiAgICBib3gtc2hhZG93OiA5cHggMTBweCAyMHB4IDBweCAjMmQyZDJkO1xyXG59XHJcblxyXG4ubG9naW46aG92ZXIsXHJcbi5yZWdpc3Rlcjpob3ZlcixcclxuLmNsb3NlLWJveDpob3ZlciB7XHJcbiAgICBjdXJzb3I6IHBvaW50ZXI7XHJcbn1cclxuXHJcbi5jbG9zZS1ib3g6aG92ZXIge1xyXG4gICAgYW5pbWF0aW9uOiBjbG9zZS1ib3gtY29sb3JJbmNyIDAuMnM7XHJcbiAgICBhbmltYXRpb24tdGltaW5nLWZ1bmN0aW9uOiBlYXNlLWluO1xyXG4gICAgYW5pbWF0aW9uLWZpbGwtbW9kZTogYm90aDtcclxufVxyXG5cclxuLnRvcC1oZWFkZXItYnRuIHtcclxuICAgIGZvbnQtc2l6ZTogMTNweDtcclxuICAgIHBhZGRpbmc6IDhweCAyNXB4O1xyXG4gICAgbGV0dGVyLXNwYWNpbmc6IDFweDtcclxuICAgIG1hcmdpbi10b3A6IC01cHg7XHJcbiAgICBmb250LXdlaWdodDogNjAwO1xyXG59XHJcblxyXG4udG9wLWhlYWRlci1idG46aG92ZXIge1xyXG4gICAgYmFja2dyb3VuZC1jb2xvcjogYmxhY2sgIWltcG9ydGFudDtcclxufVxyXG5cclxuQGtleWZyYW1lcyBib3hQb3NpdGlvbiB7XHJcbiAgICBmcm9tIHtcclxuICAgICAgICBvcGFjaXR5OiAwLjI7XHJcbiAgICB9XHJcbiAgICB0byB7XHJcbiAgICAgICAgb3BhY2l0eTogMTtcclxuICAgICAgICB0b3A6IDMwcHg7XHJcbiAgICB9XHJcbn1cclxuXHJcbkBrZXlmcmFtZXMgY2xvc2UtYm94LWNvbG9ySW5jciB7XHJcbiAgICAxMDAlIHtcclxuICAgICAgICBjb2xvcjogYmxhY2s7XHJcbiAgICB9XHJcbn0iXX0= */"] });
/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵsetClassMetadata"](TopHeaderComponent, [{
        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"],
        args: [{
                selector: 'app-top-header',
                templateUrl: './top-header.component.html',
                styleUrls: ['./top-header.component.css']
            }]
    }], function () { return []; }, null); })();


/***/ }),

/***/ "./src/app/models/carousel_image.model.ts":
/*!************************************************!*\
  !*** ./src/app/models/carousel_image.model.ts ***!
  \************************************************/
/*! exports provided: CarouselImage */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CarouselImage", function() { return CarouselImage; });
class CarouselImage {
    constructor(imageID, imageUrl, imageDescription, secondSentence, imageOrientation) {
        this.imageID = imageID;
        this.imageUrl = imageUrl;
        this.imageDescription = imageDescription;
        this.secondSentence = secondSentence;
        this.imageOrientation = imageOrientation;
    }
}


/***/ }),

/***/ "./src/app/models/category.model.ts":
/*!******************************************!*\
  !*** ./src/app/models/category.model.ts ***!
  \******************************************/
/*! exports provided: Category */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Category", function() { return Category; });
class Category {
    constructor(categoryID, imagePath, categoryName, viewName) {
        this.categoryID = categoryID;
        this.imagePath = imagePath;
        this.categoryName = categoryName;
        this.viewName = viewName;
    }
}


/***/ }),

/***/ "./src/app/models/header_options.model.ts":
/*!************************************************!*\
  !*** ./src/app/models/header_options.model.ts ***!
  \************************************************/
/*! exports provided: HeaderOption */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HeaderOption", function() { return HeaderOption; });
class HeaderOption {
    constructor(name, options) {
        this.name = name;
        this.options = options;
    }
}


/***/ }),

/***/ "./src/app/models/new_arrivals_set.model.ts":
/*!**************************************************!*\
  !*** ./src/app/models/new_arrivals_set.model.ts ***!
  \**************************************************/
/*! exports provided: NewArrivalSet */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NewArrivalSet", function() { return NewArrivalSet; });
class NewArrivalSet {
    constructor(id, src, name) {
        this.id = id;
        this.src = src;
        this.name = name;
    }
}


/***/ }),

/***/ "./src/app/models/product.model.ts":
/*!*****************************************!*\
  !*** ./src/app/models/product.model.ts ***!
  \*****************************************/
/*! exports provided: Product */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Product", function() { return Product; });
class Product {
    constructor(productID, imagePath, productName, categoryID, price, collectionID, inStockQuantity, sectionID, version) {
        this.productID = productID;
        this.imagePath = imagePath;
        this.productName = productName;
        this.categoryID = categoryID;
        this.price = price;
        this.collectionID = collectionID;
        this.inStockQuantity = inStockQuantity;
        this.sectionID = sectionID;
        this.version = version;
    }
}


/***/ }),

/***/ "./src/app/services/home-loader.service.ts":
/*!*************************************************!*\
  !*** ./src/app/services/home-loader.service.ts ***!
  \*************************************************/
/*! exports provided: HomeLoaderService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HomeLoaderService", function() { return HomeLoaderService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm2015/index.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/__ivy_ngcc__/fesm2015/http.js");




class HomeLoaderService {
    constructor(http) {
        this.http = http;
        this.CAROUSEL_URL = 'homePageSlidingImages/getAllImages';
        this.CATEGORY_URL = 'categories/getAll';
        this.NEW_ARRIVAL_URL = 'products/getLatestThreeProducts';
        this.carouselImages = [];
        this.carouselImagesObserver = new rxjs__WEBPACK_IMPORTED_MODULE_1__["Subject"]();
        this.categoryModels = [];
        this.categoryModelsObserver = new rxjs__WEBPACK_IMPORTED_MODULE_1__["Subject"]();
        this.newArrivals = [];
        this.newArrivalsObserver = new rxjs__WEBPACK_IMPORTED_MODULE_1__["Subject"]();
    }
    fetchCarouselImages() {
        this.http.get(this.CAROUSEL_URL).subscribe((response) => {
            this.carouselImages = response;
            this.carouselImagesObserver.next(true);
        }, error => {
            this.carouselImages = [];
            this.carouselImagesObserver.next(true);
        });
    }
    getCarouselImages() {
        return this.carouselImages.slice();
    }
    fetchCategoryModels() {
        this.http.get(this.CATEGORY_URL).subscribe((response) => {
            this.categoryModels = response;
            this.categoryModelsObserver.next(true);
        }, error => {
            this.categoryModels = [];
            this.categoryModelsObserver.next(true);
        });
    }
    getCategoryModels() {
        this.categoryModels.forEach(c => {
            if (c.categoryName.toLowerCase() === 'bangles')
                c.categoryID = 5;
            c.imagePath = 'assets/popular_collections/p' + c.categoryID + '.png';
            c.viewName = 'Popular ' + c.categoryName.substr(0, 1).toUpperCase() + c.categoryName.substr(1).toLowerCase();
        });
        return this.categoryModels.slice();
    }
    fetchNewArrivals() {
        this.http.get(this.NEW_ARRIVAL_URL).subscribe((response) => {
            this.newArrivals = response;
            this.newArrivalsObserver.next(true);
        }, error => {
            this.newArrivals = [];
            this.newArrivalsObserver.next(true);
        });
    }
    getNewArrivals() {
        return this.newArrivals.slice();
    }
}
HomeLoaderService.ɵfac = function HomeLoaderService_Factory(t) { return new (t || HomeLoaderService)(_angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵinject"](_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"])); };
HomeLoaderService.ɵprov = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineInjectable"]({ token: HomeLoaderService, factory: HomeLoaderService.ɵfac, providedIn: 'root' });
/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵsetClassMetadata"](HomeLoaderService, [{
        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"],
        args: [{
                providedIn: 'root'
            }]
    }], function () { return [{ type: _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"] }]; }, null); })();


/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
const environment = {
    production: false
};
/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/__ivy_ngcc__/fesm2015/platform-browser.js");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_1__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
_angular_platform_browser__WEBPACK_IMPORTED_MODULE_3__["platformBrowser"]().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(err => console.error(err));


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! D:\Seethend\Akhil\mdb-bootstrap\j-front\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main-es2015.js.map