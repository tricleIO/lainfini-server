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
 * Wageclosingdef
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Wageclosingdef   {
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

  @SerializedName("periodicity")
  private Integer periodicity = null;

  @SerializedName("calcchart_id")
  private String calcchartId = null;

  @SerializedName("toaccounting")
  private Boolean toaccounting = null;

  @SerializedName("accpresetdef_id")
  private String accpresetdefId = null;

  @SerializedName("splitbyoperations")
  private Boolean splitbyoperations = null;

  @SerializedName("operationcodes")
  private String operationcodes = null;

  @SerializedName("topaymentorder")
  private Boolean topaymentorder = null;

  @SerializedName("minussign")
  private Boolean minussign = null;

  @SerializedName("paymentdef_id")
  private String paymentdefId = null;

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("rounding")
  private Integer rounding = null;

  @SerializedName("correctiontype")
  private Integer correctiontype = null;

  @SerializedName("correctionexpr")
  private String correctionexpr = null;

  @SerializedName("correctiontypeastext")
  private String correctiontypeastext = null;

  @SerializedName("onlyevalexpression")
  private Boolean onlyevalexpression = null;

  public Wageclosingdef displayname(String displayname) {
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

  public Wageclosingdef id(String id) {
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

  public Wageclosingdef classid(String classid) {
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

  public Wageclosingdef objversion(Integer objversion) {
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

  public Wageclosingdef hidden(Boolean hidden) {
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

  public Wageclosingdef code(String code) {
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

  public Wageclosingdef name(String name) {
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

  public Wageclosingdef periodicity(Integer periodicity) {
    this.periodicity = periodicity;
    return this;
  }

   /**
   * periodicita [persistentní položka]
   * @return periodicity
  **/
  @ApiModelProperty(example = "null", value = "periodicita [persistentní položka]")
  public Integer getPeriodicity() {
    return periodicity;
  }

  public void setPeriodicity(Integer periodicity) {
    this.periodicity = periodicity;
  }

  public Wageclosingdef calcchartId(String calcchartId) {
    this.calcchartId = calcchartId;
    return this;
  }

   /**
   * výpočtové schéma; id objektu výpočtové schéma [persistentní položka]
   * @return calcchartId
  **/
  @ApiModelProperty(example = "null", value = "výpočtové schéma; id objektu výpočtové schéma [persistentní položka]")
  public String getCalcchartId() {
    return calcchartId;
  }

  public void setCalcchartId(String calcchartId) {
    this.calcchartId = calcchartId;
  }

  public Wageclosingdef toaccounting(Boolean toaccounting) {
    this.toaccounting = toaccounting;
    return this;
  }

   /**
   * Účtovat částku [persistentní položka]
   * @return toaccounting
  **/
  @ApiModelProperty(example = "null", value = "Účtovat částku [persistentní položka]")
  public Boolean getToaccounting() {
    return toaccounting;
  }

  public void setToaccounting(Boolean toaccounting) {
    this.toaccounting = toaccounting;
  }

  public Wageclosingdef accpresetdefId(String accpresetdefId) {
    this.accpresetdefId = accpresetdefId;
    return this;
  }

   /**
   * předkontace; id objektu Účetní předkontace [persistentní položka]
   * @return accpresetdefId
  **/
  @ApiModelProperty(example = "null", value = "předkontace; id objektu Účetní předkontace [persistentní položka]")
  public String getAccpresetdefId() {
    return accpresetdefId;
  }

  public void setAccpresetdefId(String accpresetdefId) {
    this.accpresetdefId = accpresetdefId;
  }

  public Wageclosingdef splitbyoperations(Boolean splitbyoperations) {
    this.splitbyoperations = splitbyoperations;
    return this;
  }

   /**
   * rozdělit [persistentní položka]
   * @return splitbyoperations
  **/
  @ApiModelProperty(example = "null", value = "rozdělit [persistentní položka]")
  public Boolean getSplitbyoperations() {
    return splitbyoperations;
  }

  public void setSplitbyoperations(Boolean splitbyoperations) {
    this.splitbyoperations = splitbyoperations;
  }

  public Wageclosingdef operationcodes(String operationcodes) {
    this.operationcodes = operationcodes;
    return this;
  }

   /**
   * výkony [persistentní položka]
   * @return operationcodes
  **/
  @ApiModelProperty(example = "null", value = "výkony [persistentní položka]")
  public String getOperationcodes() {
    return operationcodes;
  }

  public void setOperationcodes(String operationcodes) {
    this.operationcodes = operationcodes;
  }

  public Wageclosingdef topaymentorder(Boolean topaymentorder) {
    this.topaymentorder = topaymentorder;
    return this;
  }

   /**
   * platební příkaz [persistentní položka]
   * @return topaymentorder
  **/
  @ApiModelProperty(example = "null", value = "platební příkaz [persistentní položka]")
  public Boolean getTopaymentorder() {
    return topaymentorder;
  }

  public void setTopaymentorder(Boolean topaymentorder) {
    this.topaymentorder = topaymentorder;
  }

  public Wageclosingdef minussign(Boolean minussign) {
    this.minussign = minussign;
    return this;
  }

   /**
   * záporná částka [persistentní položka]
   * @return minussign
  **/
  @ApiModelProperty(example = "null", value = "záporná částka [persistentní položka]")
  public Boolean getMinussign() {
    return minussign;
  }

  public void setMinussign(Boolean minussign) {
    this.minussign = minussign;
  }

  public Wageclosingdef paymentdefId(String paymentdefId) {
    this.paymentdefId = paymentdefId;
    return this;
  }

   /**
   * definice platby; id objektu definice plateb [persistentní položka]
   * @return paymentdefId
  **/
  @ApiModelProperty(example = "null", value = "definice platby; id objektu definice plateb [persistentní položka]")
  public String getPaymentdefId() {
    return paymentdefId;
  }

  public void setPaymentdefId(String paymentdefId) {
    this.paymentdefId = paymentdefId;
  }

  public Wageclosingdef docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * Řada dokladů uzávěrky; id objektu Řada dokladů [persistentní položka]
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "Řada dokladů uzávěrky; id objektu Řada dokladů [persistentní položka]")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Wageclosingdef correctedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
    return this;
  }

   /**
   * opravil; id objektu uživatel [persistentní položka]
   * @return correctedbyId
  **/
  @ApiModelProperty(example = "null", value = "opravil; id objektu uživatel [persistentní položka]")
  public String getCorrectedbyId() {
    return correctedbyId;
  }

  public void setCorrectedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
  }

  public Wageclosingdef createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * vytvořil; id objektu uživatel [persistentní položka]
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "vytvořil; id objektu uživatel [persistentní položka]")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Wageclosingdef rounding(Integer rounding) {
    this.rounding = rounding;
    return this;
  }

   /**
   * zaokrouhlení [persistentní položka]
   * @return rounding
  **/
  @ApiModelProperty(example = "null", value = "zaokrouhlení [persistentní položka]")
  public Integer getRounding() {
    return rounding;
  }

  public void setRounding(Integer rounding) {
    this.rounding = rounding;
  }

  public Wageclosingdef correctiontype(Integer correctiontype) {
    this.correctiontype = correctiontype;
    return this;
  }

   /**
   * typ korekce [persistentní položka]
   * @return correctiontype
  **/
  @ApiModelProperty(example = "null", value = "typ korekce [persistentní položka]")
  public Integer getCorrectiontype() {
    return correctiontype;
  }

  public void setCorrectiontype(Integer correctiontype) {
    this.correctiontype = correctiontype;
  }

  public Wageclosingdef correctionexpr(String correctionexpr) {
    this.correctionexpr = correctionexpr;
    return this;
  }

   /**
   * korekce [persistentní položka]
   * @return correctionexpr
  **/
  @ApiModelProperty(example = "null", value = "korekce [persistentní položka]")
  public String getCorrectionexpr() {
    return correctionexpr;
  }

  public void setCorrectionexpr(String correctionexpr) {
    this.correctionexpr = correctionexpr;
  }

  public Wageclosingdef correctiontypeastext(String correctiontypeastext) {
    this.correctiontypeastext = correctiontypeastext;
    return this;
  }

   /**
   * typ korekce
   * @return correctiontypeastext
  **/
  @ApiModelProperty(example = "null", value = "typ korekce")
  public String getCorrectiontypeastext() {
    return correctiontypeastext;
  }

  public void setCorrectiontypeastext(String correctiontypeastext) {
    this.correctiontypeastext = correctiontypeastext;
  }

  public Wageclosingdef onlyevalexpression(Boolean onlyevalexpression) {
    this.onlyevalexpression = onlyevalexpression;
    return this;
  }

   /**
   * jen vyhodnotit výraz [persistentní položka]
   * @return onlyevalexpression
  **/
  @ApiModelProperty(example = "null", value = "jen vyhodnotit výraz [persistentní položka]")
  public Boolean getOnlyevalexpression() {
    return onlyevalexpression;
  }

  public void setOnlyevalexpression(Boolean onlyevalexpression) {
    this.onlyevalexpression = onlyevalexpression;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wageclosingdef wageclosingdef = (Wageclosingdef) o;
    return Objects.equals(this.displayname, wageclosingdef.displayname) &&
        Objects.equals(this.id, wageclosingdef.id) &&
        Objects.equals(this.classid, wageclosingdef.classid) &&
        Objects.equals(this.objversion, wageclosingdef.objversion) &&
        Objects.equals(this.hidden, wageclosingdef.hidden) &&
        Objects.equals(this.code, wageclosingdef.code) &&
        Objects.equals(this.name, wageclosingdef.name) &&
        Objects.equals(this.periodicity, wageclosingdef.periodicity) &&
        Objects.equals(this.calcchartId, wageclosingdef.calcchartId) &&
        Objects.equals(this.toaccounting, wageclosingdef.toaccounting) &&
        Objects.equals(this.accpresetdefId, wageclosingdef.accpresetdefId) &&
        Objects.equals(this.splitbyoperations, wageclosingdef.splitbyoperations) &&
        Objects.equals(this.operationcodes, wageclosingdef.operationcodes) &&
        Objects.equals(this.topaymentorder, wageclosingdef.topaymentorder) &&
        Objects.equals(this.minussign, wageclosingdef.minussign) &&
        Objects.equals(this.paymentdefId, wageclosingdef.paymentdefId) &&
        Objects.equals(this.docqueueId, wageclosingdef.docqueueId) &&
        Objects.equals(this.correctedbyId, wageclosingdef.correctedbyId) &&
        Objects.equals(this.createdbyId, wageclosingdef.createdbyId) &&
        Objects.equals(this.rounding, wageclosingdef.rounding) &&
        Objects.equals(this.correctiontype, wageclosingdef.correctiontype) &&
        Objects.equals(this.correctionexpr, wageclosingdef.correctionexpr) &&
        Objects.equals(this.correctiontypeastext, wageclosingdef.correctiontypeastext) &&
        Objects.equals(this.onlyevalexpression, wageclosingdef.onlyevalexpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, code, name, periodicity, calcchartId, toaccounting, accpresetdefId, splitbyoperations, operationcodes, topaymentorder, minussign, paymentdefId, docqueueId, correctedbyId, createdbyId, rounding, correctiontype, correctionexpr, correctiontypeastext, onlyevalexpression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wageclosingdef {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    calcchartId: ").append(toIndentedString(calcchartId)).append("\n");
    sb.append("    toaccounting: ").append(toIndentedString(toaccounting)).append("\n");
    sb.append("    accpresetdefId: ").append(toIndentedString(accpresetdefId)).append("\n");
    sb.append("    splitbyoperations: ").append(toIndentedString(splitbyoperations)).append("\n");
    sb.append("    operationcodes: ").append(toIndentedString(operationcodes)).append("\n");
    sb.append("    topaymentorder: ").append(toIndentedString(topaymentorder)).append("\n");
    sb.append("    minussign: ").append(toIndentedString(minussign)).append("\n");
    sb.append("    paymentdefId: ").append(toIndentedString(paymentdefId)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    rounding: ").append(toIndentedString(rounding)).append("\n");
    sb.append("    correctiontype: ").append(toIndentedString(correctiontype)).append("\n");
    sb.append("    correctionexpr: ").append(toIndentedString(correctionexpr)).append("\n");
    sb.append("    correctiontypeastext: ").append(toIndentedString(correctiontypeastext)).append("\n");
    sb.append("    onlyevalexpression: ").append(toIndentedString(onlyevalexpression)).append("\n");
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

