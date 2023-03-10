import{NgModule}from'@angular/core';
import {BrowserModule }from '@angular/platform-browser';

import {AppRoutingModule}from './app-routing.module';
import {AppComponent}from './app.component';
import {BrowserAnimationsModule}from '@angular/platform-browser/animations';
import {UploadVideoComponent}from './upload-video/upload-video.component';
import {FormsModule}from '@angular/forms';
import {NgxFileDropModule}from 'ngx-file-drop';
import {HttpClientModule}from '@angular/common/http';
import { HeaderComponent}from './header/header.component';


@NgModule({
declarations: [
AppComponent,
UploadVideoComponent,
HeaderComponent
],
imports: [
BrowserModule,
AppRoutingModule,
BrowserAnimationsModule,
FormsModule,
HttpClientModule,
NgxFileDropModule
],
providers: [],
bootstrap: [AppComponent]
})
export class AppModule {

}
