FROM php:7.1-fpm

RUN apt-get update

RUN apt-get install libpng-dev -y

RUN docker-php-ext-install mysqli && docker-php-ext-enable mysqli

RUN docker-php-ext-install gd && docker-php-ext-enable gd
