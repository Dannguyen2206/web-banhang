var app = angular.module("myapp", []);


$(document).ready(function () {

    $('.items').slick({
        infinite: true,
        slidesToShow: 4,
        slidesToScroll: 4
    });

});