// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill/v1/bill.proto

package com.didiyun.bill.v1;

public interface CheckPriceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.bill.v1.CheckPriceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *最匹配的优惠券id，可在操作中传入
   * </pre>
   *
   * <code>string bestCouponId = 1;</code>
   * @return The bestCouponId.
   */
  java.lang.String getBestCouponId();
  /**
   * <pre>
   *最匹配的优惠券id，可在操作中传入
   * </pre>
   *
   * <code>string bestCouponId = 1;</code>
   * @return The bytes for bestCouponId.
   */
  com.google.protobuf.ByteString
      getBestCouponIdBytes();

  /**
   * <pre>
   *现金余额
   * </pre>
   *
   * <code>int64 cashBalance = 2;</code>
   * @return The cashBalance.
   */
  long getCashBalance();

  /**
   * <pre>
   *优惠券余额
   * </pre>
   *
   * <code>int64 couponBalance = 3;</code>
   * @return The couponBalance.
   */
  long getCouponBalance();

  /**
   * <pre>
   *当前冻结金额
   * </pre>
   *
   * <code>int64 frozenPrice = 4;</code>
   * @return The frozenPrice.
   */
  long getFrozenPrice();

  /**
   * <pre>
   *余额是否足够一次创建
   * </pre>
   *
   * <code>bool isClearToCreate = 5;</code>
   * @return The isClearToCreate.
   */
  boolean getIsClearToCreate();

  /**
   * <pre>
   *原价格
   * </pre>
   *
   * <code>int64 originPrice = 6;</code>
   * @return The originPrice.
   */
  long getOriginPrice();

  /**
   * <pre>
   *付费方式，"postPaid"为后付费，"prepPaid"为先付费
   * </pre>
   *
   * <code>string payType = 7;</code>
   * @return The payType.
   */
  java.lang.String getPayType();
  /**
   * <pre>
   *付费方式，"postPaid"为后付费，"prepPaid"为先付费
   * </pre>
   *
   * <code>string payType = 7;</code>
   * @return The bytes for payType.
   */
  com.google.protobuf.ByteString
      getPayTypeBytes();

  /**
   * <pre>
   *后付费部分的价格，单位为月
   * </pre>
   *
   * <code>int64 postPaidPrice = 8;</code>
   * @return The postPaidPrice.
   */
  long getPostPaidPrice();

  /**
   * <pre>
   *先付费部分的价格，单位为月
   * </pre>
   *
   * <code>int64 prePaidPrice = 9;</code>
   * @return The prePaidPrice.
   */
  long getPrePaidPrice();

  /**
   * <pre>
   *当余额不足时，表示还差多少钱可以创建此资源
   * </pre>
   *
   * <code>int64 subPrice = 10;</code>
   * @return The subPrice.
   */
  long getSubPrice();
}
