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

import java.util.Objects;


/**
 * Paymenttype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Paymenttype   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("paymentkind")
  private Integer paymentkind = null;

  @SerializedName("commenttitle")
  private String commenttitle = null;

  @SerializedName("commentrequired")
  private Boolean commentrequired = null;

  @SerializedName("authcoderequired")
  private Boolean authcoderequired = null;

  @SerializedName("summarizedisabled")
  private Boolean summarizedisabled = null;

  @SerializedName("printcomment")
  private Boolean printcomment = null;

  @SerializedName("maximumgivebackamount")
  private Double maximumgivebackamount = null;

  @SerializedName("analyticalaccount")
  private String analyticalaccount = null;

  @SerializedName("maximumpaymentamount")
  private Double maximumpaymentamount = null;

  @SerializedName("eet")
  private Boolean eet = null;

  public Paymenttype displayname(String displayname) {
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

  public Paymenttype id(String id) {
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

  public Paymenttype classid(String classid) {
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

  public Paymenttype objversion(Integer objversion) {
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

  public Paymenttype hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * skrytý [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "skrytý [persistentní položka]")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Paymenttype code(String code) {
    this.code = code;
    return this;
  }

   /**
   * kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Paymenttype name(String name) {
    this.name = name;
    return this;
  }

   /**
   * název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Paymenttype paymentkind(Integer paymentkind) {
    this.paymentkind = paymentkind;
    return this;
  }

   /**
   * typ [persistentní položka]
   * @return paymentkind
  **/
  @ApiModelProperty(example = "null", value = "typ [persistentní položka]")
  public Integer getPaymentkind() {
    return paymentkind;
  }

  public void setPaymentkind(Integer paymentkind) {
    this.paymentkind = paymentkind;
  }

  public Paymenttype commenttitle(String commenttitle) {
    this.commenttitle = commenttitle;
    return this;
  }

   /**
   * nadpis komentáře [persistentní položka]
   * @return commenttitle
  **/
  @ApiModelProperty(example = "null", value = "nadpis komentáře [persistentní položka]")
  public String getCommenttitle() {
    return commenttitle;
  }

  public void setCommenttitle(String commenttitle) {
    this.commenttitle = commenttitle;
  }

  public Paymenttype commentrequired(Boolean commentrequired) {
    this.commentrequired = commentrequired;
    return this;
  }

   /**
   * vyžadovat komentář [persistentní položka]
   * @return commentrequired
  **/
  @ApiModelProperty(example = "null", value = "vyžadovat komentář [persistentní položka]")
  public Boolean getCommentrequired() {
    return commentrequired;
  }

  public void setCommentrequired(Boolean commentrequired) {
    this.commentrequired = commentrequired;
  }

  public Paymenttype authcoderequired(Boolean authcoderequired) {
    this.authcoderequired = authcoderequired;
    return this;
  }

   /**
   * vyžadovat autorizační kód [persistentní položka]
   * @return authcoderequired
  **/
  @ApiModelProperty(example = "null", value = "vyžadovat autorizační kód [persistentní položka]")
  public Boolean getAuthcoderequired() {
    return authcoderequired;
  }

  public void setAuthcoderequired(Boolean authcoderequired) {
    this.authcoderequired = authcoderequired;
  }

  public Paymenttype summarizedisabled(Boolean summarizedisabled) {
    this.summarizedisabled = summarizedisabled;
    return this;
  }

   /**
   * nesčítat [persistentní položka]
   * @return summarizedisabled
  **/
  @ApiModelProperty(example = "null", value = "nesčítat [persistentní položka]")
  public Boolean getSummarizedisabled() {
    return summarizedisabled;
  }

  public void setSummarizedisabled(Boolean summarizedisabled) {
    this.summarizedisabled = summarizedisabled;
  }

  public Paymenttype printcomment(Boolean printcomment) {
    this.printcomment = printcomment;
    return this;
  }

   /**
   * tisknout popis [persistentní položka]
   * @return printcomment
  **/
  @ApiModelProperty(example = "null", value = "tisknout popis [persistentní položka]")
  public Boolean getPrintcomment() {
    return printcomment;
  }

  public void setPrintcomment(Boolean printcomment) {
    this.printcomment = printcomment;
  }

  public Paymenttype maximumgivebackamount(Double maximumgivebackamount) {
    this.maximumgivebackamount = maximumgivebackamount;
    return this;
  }

   /**
   * max.vracená částka [persistentní položka]
   * @return maximumgivebackamount
  **/
  @ApiModelProperty(example = "null", value = "max.vracená částka [persistentní položka]")
  public Double getMaximumgivebackamount() {
    return maximumgivebackamount;
  }

  public void setMaximumgivebackamount(Double maximumgivebackamount) {
    this.maximumgivebackamount = maximumgivebackamount;
  }

  public Paymenttype analyticalaccount(String analyticalaccount) {
    this.analyticalaccount = analyticalaccount;
    return this;
  }

   /**
   * analytika [persistentní položka]
   * @return analyticalaccount
  **/
  @ApiModelProperty(example = "null", value = "analytika [persistentní položka]")
  public String getAnalyticalaccount() {
    return analyticalaccount;
  }

  public void setAnalyticalaccount(String analyticalaccount) {
    this.analyticalaccount = analyticalaccount;
  }

  public Paymenttype maximumpaymentamount(Double maximumpaymentamount) {
    this.maximumpaymentamount = maximumpaymentamount;
    return this;
  }

   /**
   * maximální částka platby [persistentní položka]
   * @return maximumpaymentamount
  **/
  @ApiModelProperty(example = "null", value = "maximální částka platby [persistentní položka]")
  public Double getMaximumpaymentamount() {
    return maximumpaymentamount;
  }

  public void setMaximumpaymentamount(Double maximumpaymentamount) {
    this.maximumpaymentamount = maximumpaymentamount;
  }

  public Paymenttype eet(Boolean eet) {
    this.eet = eet;
    return this;
  }

   /**
   * eet [persistentní položka]
   * @return eet
  **/
  @ApiModelProperty(example = "null", value = "eet [persistentní položka]")
  public Boolean getEet() {
    return eet;
  }

  public void setEet(Boolean eet) {
    this.eet = eet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paymenttype paymenttype = (Paymenttype) o;
    return Objects.equals(this.displayname, paymenttype.displayname) &&
        Objects.equals(this.id, paymenttype.id) &&
        Objects.equals(this.classid, paymenttype.classid) &&
        Objects.equals(this.objversion, paymenttype.objversion) &&
        Objects.equals(this.hidden, paymenttype.hidden) &&
        Objects.equals(this.code, paymenttype.code) &&
        Objects.equals(this.name, paymenttype.name) &&
        Objects.equals(this.paymentkind, paymenttype.paymentkind) &&
        Objects.equals(this.commenttitle, paymenttype.commenttitle) &&
        Objects.equals(this.commentrequired, paymenttype.commentrequired) &&
        Objects.equals(this.authcoderequired, paymenttype.authcoderequired) &&
        Objects.equals(this.summarizedisabled, paymenttype.summarizedisabled) &&
        Objects.equals(this.printcomment, paymenttype.printcomment) &&
        Objects.equals(this.maximumgivebackamount, paymenttype.maximumgivebackamount) &&
        Objects.equals(this.analyticalaccount, paymenttype.analyticalaccount) &&
        Objects.equals(this.maximumpaymentamount, paymenttype.maximumpaymentamount) &&
        Objects.equals(this.eet, paymenttype.eet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, code, name, paymentkind, commenttitle, commentrequired, authcoderequired, summarizedisabled, printcomment, maximumgivebackamount, analyticalaccount, maximumpaymentamount, eet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paymenttype {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentkind: ").append(toIndentedString(paymentkind)).append("\n");
    sb.append("    commenttitle: ").append(toIndentedString(commenttitle)).append("\n");
    sb.append("    commentrequired: ").append(toIndentedString(commentrequired)).append("\n");
    sb.append("    authcoderequired: ").append(toIndentedString(authcoderequired)).append("\n");
    sb.append("    summarizedisabled: ").append(toIndentedString(summarizedisabled)).append("\n");
    sb.append("    printcomment: ").append(toIndentedString(printcomment)).append("\n");
    sb.append("    maximumgivebackamount: ").append(toIndentedString(maximumgivebackamount)).append("\n");
    sb.append("    analyticalaccount: ").append(toIndentedString(analyticalaccount)).append("\n");
    sb.append("    maximumpaymentamount: ").append(toIndentedString(maximumpaymentamount)).append("\n");
    sb.append("    eet: ").append(toIndentedString(eet)).append("\n");
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

