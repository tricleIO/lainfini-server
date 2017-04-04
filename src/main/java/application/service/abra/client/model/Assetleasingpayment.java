/**
 * abra gen web api (spojení testapi)
 * webové api systému 17.03.03
 *
 * OpenAPI spec version: 17.03.03
 * Contact: abragen@abra.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package application.service.abra.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * Assetleasingpayment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Assetleasingpayment   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("paymentdate$date")
  private DateTime paymentdatedate = null;

  @SerializedName("topaytotalamount")
  private Double topaytotalamount = null;

  @SerializedName("topayvat")
  private Double topayvat = null;

  @SerializedName("isgenerated")
  private Boolean isgenerated = null;

  @SerializedName("topaydoc_type")
  private String topaydocType = null;

  @SerializedName("topaydoc_id")
  private String topaydocId = null;

  @SerializedName("hireamount")
  private Double hireamount = null;

  @SerializedName("hireinsuaranceamount")
  private Double hireinsuaranceamount = null;

  @SerializedName("hireamountvat")
  private Double hireamountvat = null;

  @SerializedName("hiredoc_id")
  private String hiredocId = null;

  @SerializedName("paymentorder_id")
  private String paymentorderId = null;

  public Assetleasingpayment displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * název
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "název")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Assetleasingpayment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * vlastní id [persistentní položka]
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "vlastní id [persistentní položka]")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Assetleasingpayment classid(String classid) {
    this.classid = classid;
    return this;
  }

   /**
   * id třídy
   * @return classid
  **/
  @ApiModelProperty(example = "null", value = "id třídy")
  public String getClassid() {
    return classid;
  }

  public void setClassid(String classid) {
    this.classid = classid;
  }

  public Assetleasingpayment objversion(Integer objversion) {
    this.objversion = objversion;
    return this;
  }

   /**
   * verze objektu [persistentní položka]
   * @return objversion
  **/
  @ApiModelProperty(example = "null", value = "verze objektu [persistentní položka]")
  public Integer getObjversion() {
    return objversion;
  }

  public void setObjversion(Integer objversion) {
    this.objversion = objversion;
  }

  public Assetleasingpayment parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu hlavičkový objekt [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu hlavičkový objekt [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Assetleasingpayment paymentdatedate(DateTime paymentdatedate) {
    this.paymentdatedate = paymentdatedate;
    return this;
  }

   /**
   * splatno [persistentní položka]
   * @return paymentdatedate
  **/
  @ApiModelProperty(example = "null", value = "splatno [persistentní položka]")
  public DateTime getPaymentdatedate() {
    return paymentdatedate;
  }

  public void setPaymentdatedate(DateTime paymentdatedate) {
    this.paymentdatedate = paymentdatedate;
  }

  public Assetleasingpayment topaytotalamount(Double topaytotalamount) {
    this.topaytotalamount = topaytotalamount;
    return this;
  }

   /**
   * Částka k úhradě [persistentní položka]
   * @return topaytotalamount
  **/
  @ApiModelProperty(example = "null", value = "Částka k úhradě [persistentní položka]")
  public Double getTopaytotalamount() {
    return topaytotalamount;
  }

  public void setTopaytotalamount(Double topaytotalamount) {
    this.topaytotalamount = topaytotalamount;
  }

  public Assetleasingpayment topayvat(Double topayvat) {
    this.topayvat = topayvat;
    return this;
  }

   /**
   * dph k úhradě [persistentní položka]
   * @return topayvat
  **/
  @ApiModelProperty(example = "null", value = "dph k úhradě [persistentní položka]")
  public Double getTopayvat() {
    return topayvat;
  }

  public void setTopayvat(Double topayvat) {
    this.topayvat = topayvat;
  }

  public Assetleasingpayment isgenerated(Boolean isgenerated) {
    this.isgenerated = isgenerated;
    return this;
  }

   /**
   * předpis platby námi generovaný [persistentní položka]
   * @return isgenerated
  **/
  @ApiModelProperty(example = "null", value = "předpis platby námi generovaný [persistentní položka]")
  public Boolean getIsgenerated() {
    return isgenerated;
  }

  public void setIsgenerated(Boolean isgenerated) {
    this.isgenerated = isgenerated;
  }

  public Assetleasingpayment topaydocType(String topaydocType) {
    this.topaydocType = topaydocType;
    return this;
  }

   /**
   * druh dokladu předpisu leasingové splátky [persistentní položka]
   * @return topaydocType
  **/
  @ApiModelProperty(example = "null", value = "druh dokladu předpisu leasingové splátky [persistentní položka]")
  public String getTopaydocType() {
    return topaydocType;
  }

  public void setTopaydocType(String topaydocType) {
    this.topaydocType = topaydocType;
  }

  public Assetleasingpayment topaydocId(String topaydocId) {
    this.topaydocId = topaydocId;
    return this;
  }

   /**
   * odkaz na doklad, který je předpisem leasingové splátky.; id objektu dokument [persistentní položka]
   * @return topaydocId
  **/
  @ApiModelProperty(example = "null", value = "odkaz na doklad, který je předpisem leasingové splátky.; id objektu dokument [persistentní položka]")
  public String getTopaydocId() {
    return topaydocId;
  }

  public void setTopaydocId(String topaydocId) {
    this.topaydocId = topaydocId;
  }

  public Assetleasingpayment hireamount(Double hireamount) {
    this.hireamount = hireamount;
    return this;
  }

   /**
   * nájemné bez daně [persistentní položka]
   * @return hireamount
  **/
  @ApiModelProperty(example = "null", value = "nájemné bez daně [persistentní položka]")
  public Double getHireamount() {
    return hireamount;
  }

  public void setHireamount(Double hireamount) {
    this.hireamount = hireamount;
  }

  public Assetleasingpayment hireinsuaranceamount(Double hireinsuaranceamount) {
    this.hireinsuaranceamount = hireinsuaranceamount;
    return this;
  }

   /**
   * pojištění [persistentní položka]
   * @return hireinsuaranceamount
  **/
  @ApiModelProperty(example = "null", value = "pojištění [persistentní položka]")
  public Double getHireinsuaranceamount() {
    return hireinsuaranceamount;
  }

  public void setHireinsuaranceamount(Double hireinsuaranceamount) {
    this.hireinsuaranceamount = hireinsuaranceamount;
  }

  public Assetleasingpayment hireamountvat(Double hireamountvat) {
    this.hireamountvat = hireamountvat;
    return this;
  }

   /**
   * nájemné dph [persistentní položka]
   * @return hireamountvat
  **/
  @ApiModelProperty(example = "null", value = "nájemné dph [persistentní položka]")
  public Double getHireamountvat() {
    return hireamountvat;
  }

  public void setHireamountvat(Double hireamountvat) {
    this.hireamountvat = hireamountvat;
  }

  public Assetleasingpayment hiredocId(String hiredocId) {
    this.hiredocId = hiredocId;
    return this;
  }

   /**
   * odkaz na vygenerovaný interní doklad na nájemné; id objektu ostatní výdaj [persistentní položka]
   * @return hiredocId
  **/
  @ApiModelProperty(example = "null", value = "odkaz na vygenerovaný interní doklad na nájemné; id objektu ostatní výdaj [persistentní položka]")
  public String getHiredocId() {
    return hiredocId;
  }

  public void setHiredocId(String hiredocId) {
    this.hiredocId = hiredocId;
  }

  public Assetleasingpayment paymentorderId(String paymentorderId) {
    this.paymentorderId = paymentorderId;
    return this;
  }

   /**
   * odkaz na vygenerovanou žádost o platební příkaz; id objektu platební příkaz [persistentní položka]
   * @return paymentorderId
  **/
  @ApiModelProperty(example = "null", value = "odkaz na vygenerovanou žádost o platební příkaz; id objektu platební příkaz [persistentní položka]")
  public String getPaymentorderId() {
    return paymentorderId;
  }

  public void setPaymentorderId(String paymentorderId) {
    this.paymentorderId = paymentorderId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetleasingpayment assetleasingpayment = (Assetleasingpayment) o;
    return Objects.equals(this.displayname, assetleasingpayment.displayname) &&
        Objects.equals(this.id, assetleasingpayment.id) &&
        Objects.equals(this.classid, assetleasingpayment.classid) &&
        Objects.equals(this.objversion, assetleasingpayment.objversion) &&
        Objects.equals(this.parentId, assetleasingpayment.parentId) &&
        Objects.equals(this.paymentdatedate, assetleasingpayment.paymentdatedate) &&
        Objects.equals(this.topaytotalamount, assetleasingpayment.topaytotalamount) &&
        Objects.equals(this.topayvat, assetleasingpayment.topayvat) &&
        Objects.equals(this.isgenerated, assetleasingpayment.isgenerated) &&
        Objects.equals(this.topaydocType, assetleasingpayment.topaydocType) &&
        Objects.equals(this.topaydocId, assetleasingpayment.topaydocId) &&
        Objects.equals(this.hireamount, assetleasingpayment.hireamount) &&
        Objects.equals(this.hireinsuaranceamount, assetleasingpayment.hireinsuaranceamount) &&
        Objects.equals(this.hireamountvat, assetleasingpayment.hireamountvat) &&
        Objects.equals(this.hiredocId, assetleasingpayment.hiredocId) &&
        Objects.equals(this.paymentorderId, assetleasingpayment.paymentorderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, paymentdatedate, topaytotalamount, topayvat, isgenerated, topaydocType, topaydocId, hireamount, hireinsuaranceamount, hireamountvat, hiredocId, paymentorderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetleasingpayment {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    paymentdatedate: ").append(toIndentedString(paymentdatedate)).append("\n");
    sb.append("    topaytotalamount: ").append(toIndentedString(topaytotalamount)).append("\n");
    sb.append("    topayvat: ").append(toIndentedString(topayvat)).append("\n");
    sb.append("    isgenerated: ").append(toIndentedString(isgenerated)).append("\n");
    sb.append("    topaydocType: ").append(toIndentedString(topaydocType)).append("\n");
    sb.append("    topaydocId: ").append(toIndentedString(topaydocId)).append("\n");
    sb.append("    hireamount: ").append(toIndentedString(hireamount)).append("\n");
    sb.append("    hireinsuaranceamount: ").append(toIndentedString(hireinsuaranceamount)).append("\n");
    sb.append("    hireamountvat: ").append(toIndentedString(hireamountvat)).append("\n");
    sb.append("    hiredocId: ").append(toIndentedString(hiredocId)).append("\n");
    sb.append("    paymentorderId: ").append(toIndentedString(paymentorderId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
