// Databricks notebook source
var listData = spark.sparkContext.parallelize(List("Hi everyone","Good evening","This is notebook2 of the feature_svardhin branch"))
var df = listData.toDF
df.show()
