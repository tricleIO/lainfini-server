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
 * Actionpricelistrounding
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Actionpricelistrounding   {
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

  @SerializedName("posindex")
  private Integer posindex = null;

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("amountto")
  private Double amountto = null;

  @SerializedName("pricerounding")
  private Integer pricerounding = null;

  @SerializedName("constanttoadd")
  private Double constanttoadd = null;

  @SerializedName("roundingtype")
  private Integer roundingtype = null;

  @SerializedName("roundingbase")
  private Double roundingbase = null;

  public Actionpricelistrounding displayname(String displayname) {
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

  public Actionpricelistrounding id(String id) {
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

  public Actionpricelistrounding classid(String classid) {
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

  public Actionpricelistrounding objversion(Integer objversion) {
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

  public Actionpricelistrounding parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu položka akčního ceníku [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu položka akčního ceníku [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Actionpricelistrounding posindex(Integer posindex) {
    this.posindex = posindex;
    return this;
  }

   /**
   * pořadí [persistentní položka]
   * @return posindex
  **/
  @ApiModelProperty(example = "null", value = "pořadí [persistentní položka]")
  public Integer getPosindex() {
    return posindex;
  }

  public void setPosindex(Integer posindex) {
    this.posindex = posindex;
  }

  public Actionpricelistrounding currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * měna; id objektu měna [persistentní položka]
   * @return currencyId
  **/
  @ApiModelProperty(example = "null", value = "měna; id objektu měna [persistentní položka]")
  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  public Actionpricelistrounding amountto(Double amountto) {
    this.amountto = amountto;
    return this;
  }

   /**
   * hraniční částka [persistentní položka]
   * @return amountto
  **/
  @ApiModelProperty(example = "null", value = "hraniční částka [persistentní položka]")
  public Double getAmountto() {
    return amountto;
  }

  public void setAmountto(Double amountto) {
    this.amountto = amountto;
  }

  public Actionpricelistrounding pricerounding(Integer pricerounding) {
    this.pricerounding = pricerounding;
    return this;
  }

   /**
   * zp. zaokrouhlení [persistentní položka]
   * @return pricerounding
  **/
  @ApiModelProperty(example = "null", value = "zp. zaokrouhlení [persistentní položka]")
  public Integer getPricerounding() {
    return pricerounding;
  }

  public void setPricerounding(Integer pricerounding) {
    this.pricerounding = pricerounding;
  }

  public Actionpricelistrounding constanttoadd(Double constanttoadd) {
    this.constanttoadd = constanttoadd;
    return this;
  }

   /**
   * konstanta k přičtení [persistentní položka]
   * @return constanttoadd
  **/
  @ApiModelProperty(example = "null", value = "konstanta k přičtení [persistentní položka]")
  public Double getConstanttoadd() {
    return constanttoadd;
  }

  public void setConstanttoadd(Double constanttoadd) {
    this.constanttoadd = constanttoadd;
  }

  public Actionpricelistrounding roundingtype(Integer roundingtype) {
    this.roundingtype = roundingtype;
    return this;
  }

   /**
   * typ zaokrouhlení
   * @return roundingtype
  **/
  @ApiModelProperty(example = "null", value = "typ zaokrouhlení")
  public Integer getRoundingtype() {
    return roundingtype;
  }

  public void setRoundingtype(Integer roundingtype) {
    this.roundingtype = roundingtype;
  }

  public Actionpricelistrounding roundingbase(Double roundingbase) {
    this.roundingbase = roundingbase;
    return this;
  }

   /**
   * zaokrouhlit na
   * @return roundingbase
  **/
  @ApiModelProperty(example = "null", value = "zaokrouhlit na")
  public Double getRoundingbase() {
    return roundingbase;
  }

  public void setRoundingbase(Double roundingbase) {
    this.roundingbase = roundingbase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Actionpricelistrounding actionpricelistrounding = (Actionpricelistrounding) o;
    return Objects.equals(this.displayname, actionpricelistrounding.displayname) &&
        Objects.equals(this.id, actionpricelistrounding.id) &&
        Objects.equals(this.classid, actionpricelistrounding.classid) &&
        Objects.equals(this.objversion, actionpricelistrounding.objversion) &&
        Objects.equals(this.parentId, actionpricelistrounding.parentId) &&
        Objects.equals(this.posindex, actionpricelistrounding.posindex) &&
        Objects.equals(this.currencyId, actionpricelistrounding.currencyId) &&
        Objects.equals(this.amountto, actionpricelistrounding.amountto) &&
        Objects.equals(this.pricerounding, actionpricelistrounding.pricerounding) &&
        Objects.equals(this.constanttoadd, actionpricelistrounding.constanttoadd) &&
        Objects.equals(this.roundingtype, actionpricelistrounding.roundingtype) &&
        Objects.equals(this.roundingbase, actionpricelistrounding.roundingbase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, currencyId, amountto, pricerounding, constanttoadd, roundingtype, roundingbase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Actionpricelistrounding {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    amountto: ").append(toIndentedString(amountto)).append("\n");
    sb.append("    pricerounding: ").append(toIndentedString(pricerounding)).append("\n");
    sb.append("    constanttoadd: ").append(toIndentedString(constanttoadd)).append("\n");
    sb.append("    roundingtype: ").append(toIndentedString(roundingtype)).append("\n");
    sb.append("    roundingbase: ").append(toIndentedString(roundingbase)).append("\n");
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

