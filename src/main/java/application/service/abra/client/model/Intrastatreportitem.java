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
 * Intrastatreportitem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Intrastatreportitem   {
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

  @SerializedName("itemnumber")
  private Integer itemnumber = null;

  @SerializedName("commodities_id")
  private String commoditiesId = null;

  @SerializedName("msconsdest_id")
  private String msconsdestId = null;

  @SerializedName("countryoforigin_id")
  private String countryoforiginId = null;

  @SerializedName("netmass")
  private Double netmass = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("invoicedamount")
  private Double invoicedamount = null;

  @SerializedName("transactiontype_id")
  private String transactiontypeId = null;

  @SerializedName("region_id")
  private String regionId = null;

  @SerializedName("transportation_id")
  private String transportationId = null;

  @SerializedName("deliveryterm_id")
  private String deliverytermId = null;

  @SerializedName("extratype_id")
  private String extratypeId = null;

  @SerializedName("functioncode")
  private Integer functioncode = null;

  @SerializedName("previousdeclaration_id")
  private String previousdeclarationId = null;

  @SerializedName("functioncode_text")
  private String functioncodeText = null;

  public Intrastatreportitem displayname(String displayname) {
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

  public Intrastatreportitem id(String id) {
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

  public Intrastatreportitem classid(String classid) {
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

  public Intrastatreportitem objversion(Integer objversion) {
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

  public Intrastatreportitem parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu deklarace intrastat [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu deklarace intrastat [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Intrastatreportitem itemnumber(Integer itemnumber) {
    this.itemnumber = itemnumber;
    return this;
  }

   /**
   * Číslo položky [persistentní položka]
   * @return itemnumber
  **/
  @ApiModelProperty(example = "null", value = "Číslo položky [persistentní položka]")
  public Integer getItemnumber() {
    return itemnumber;
  }

  public void setItemnumber(Integer itemnumber) {
    this.itemnumber = itemnumber;
  }

  public Intrastatreportitem commoditiesId(String commoditiesId) {
    this.commoditiesId = commoditiesId;
    return this;
  }

   /**
   * kód kombinované nomenklatury; id objektu kombinovaná nomenklatura [persistentní položka]
   * @return commoditiesId
  **/
  @ApiModelProperty(example = "null", value = "kód kombinované nomenklatury; id objektu kombinovaná nomenklatura [persistentní položka]")
  public String getCommoditiesId() {
    return commoditiesId;
  }

  public void setCommoditiesId(String commoditiesId) {
    this.commoditiesId = commoditiesId;
  }

  public Intrastatreportitem msconsdestId(String msconsdestId) {
    this.msconsdestId = msconsdestId;
    return this;
  }

   /**
   * země přij./odesl.; id objektu země [persistentní položka]
   * @return msconsdestId
  **/
  @ApiModelProperty(example = "null", value = "země přij./odesl.; id objektu země [persistentní položka]")
  public String getMsconsdestId() {
    return msconsdestId;
  }

  public void setMsconsdestId(String msconsdestId) {
    this.msconsdestId = msconsdestId;
  }

  public Intrastatreportitem countryoforiginId(String countryoforiginId) {
    this.countryoforiginId = countryoforiginId;
    return this;
  }

   /**
   * země původu; id objektu země [persistentní položka]
   * @return countryoforiginId
  **/
  @ApiModelProperty(example = "null", value = "země původu; id objektu země [persistentní položka]")
  public String getCountryoforiginId() {
    return countryoforiginId;
  }

  public void setCountryoforiginId(String countryoforiginId) {
    this.countryoforiginId = countryoforiginId;
  }

  public Intrastatreportitem netmass(Double netmass) {
    this.netmass = netmass;
    return this;
  }

   /**
   * hmotnost [persistentní položka]
   * @return netmass
  **/
  @ApiModelProperty(example = "null", value = "hmotnost [persistentní položka]")
  public Double getNetmass() {
    return netmass;
  }

  public void setNetmass(Double netmass) {
    this.netmass = netmass;
  }

  public Intrastatreportitem quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * množství mj [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "množství mj [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Intrastatreportitem invoicedamount(Double invoicedamount) {
    this.invoicedamount = invoicedamount;
    return this;
  }

   /**
   * fakturovaná hodnota [persistentní položka]
   * @return invoicedamount
  **/
  @ApiModelProperty(example = "null", value = "fakturovaná hodnota [persistentní položka]")
  public Double getInvoicedamount() {
    return invoicedamount;
  }

  public void setInvoicedamount(Double invoicedamount) {
    this.invoicedamount = invoicedamount;
  }

  public Intrastatreportitem transactiontypeId(String transactiontypeId) {
    this.transactiontypeId = transactiontypeId;
    return this;
  }

   /**
   * povaha transakce; id objektu povaha transakce [persistentní položka]
   * @return transactiontypeId
  **/
  @ApiModelProperty(example = "null", value = "povaha transakce; id objektu povaha transakce [persistentní položka]")
  public String getTransactiontypeId() {
    return transactiontypeId;
  }

  public void setTransactiontypeId(String transactiontypeId) {
    this.transactiontypeId = transactiontypeId;
  }

  public Intrastatreportitem regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * kraj přij./odesl.; id objektu kraj [persistentní položka]
   * @return regionId
  **/
  @ApiModelProperty(example = "null", value = "kraj přij./odesl.; id objektu kraj [persistentní položka]")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public Intrastatreportitem transportationId(String transportationId) {
    this.transportationId = transportationId;
    return this;
  }

   /**
   * druh dopravy; id objektu druh dopravy intrastat [persistentní položka]
   * @return transportationId
  **/
  @ApiModelProperty(example = "null", value = "druh dopravy; id objektu druh dopravy intrastat [persistentní položka]")
  public String getTransportationId() {
    return transportationId;
  }

  public void setTransportationId(String transportationId) {
    this.transportationId = transportationId;
  }

  public Intrastatreportitem deliverytermId(String deliverytermId) {
    this.deliverytermId = deliverytermId;
    return this;
  }

   /**
   * dodací podmínky; id objektu dodací podmínky [persistentní položka]
   * @return deliverytermId
  **/
  @ApiModelProperty(example = "null", value = "dodací podmínky; id objektu dodací podmínky [persistentní položka]")
  public String getDeliverytermId() {
    return deliverytermId;
  }

  public void setDeliverytermId(String deliverytermId) {
    this.deliverytermId = deliverytermId;
  }

  public Intrastatreportitem extratypeId(String extratypeId) {
    this.extratypeId = extratypeId;
    return this;
  }

   /**
   * kód zvláštního pohybu; id objektu zvláštní pohyb [persistentní položka]
   * @return extratypeId
  **/
  @ApiModelProperty(example = "null", value = "kód zvláštního pohybu; id objektu zvláštní pohyb [persistentní položka]")
  public String getExtratypeId() {
    return extratypeId;
  }

  public void setExtratypeId(String extratypeId) {
    this.extratypeId = extratypeId;
  }

  public Intrastatreportitem functioncode(Integer functioncode) {
    this.functioncode = functioncode;
    return this;
  }

   /**
   * funkční kód [persistentní položka]
   * @return functioncode
  **/
  @ApiModelProperty(example = "null", value = "funkční kód [persistentní položka]")
  public Integer getFunctioncode() {
    return functioncode;
  }

  public void setFunctioncode(Integer functioncode) {
    this.functioncode = functioncode;
  }

  public Intrastatreportitem previousdeclarationId(String previousdeclarationId) {
    this.previousdeclarationId = previousdeclarationId;
    return this;
  }

   /**
   * opravovaná deklarace; id objektu položka deklarace [persistentní položka]
   * @return previousdeclarationId
  **/
  @ApiModelProperty(example = "null", value = "opravovaná deklarace; id objektu položka deklarace [persistentní položka]")
  public String getPreviousdeclarationId() {
    return previousdeclarationId;
  }

  public void setPreviousdeclarationId(String previousdeclarationId) {
    this.previousdeclarationId = previousdeclarationId;
  }

  public Intrastatreportitem functioncodeText(String functioncodeText) {
    this.functioncodeText = functioncodeText;
    return this;
  }

   /**
   * funkční kód - text
   * @return functioncodeText
  **/
  @ApiModelProperty(example = "null", value = "funkční kód - text")
  public String getFunctioncodeText() {
    return functioncodeText;
  }

  public void setFunctioncodeText(String functioncodeText) {
    this.functioncodeText = functioncodeText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intrastatreportitem intrastatreportitem = (Intrastatreportitem) o;
    return Objects.equals(this.displayname, intrastatreportitem.displayname) &&
        Objects.equals(this.id, intrastatreportitem.id) &&
        Objects.equals(this.classid, intrastatreportitem.classid) &&
        Objects.equals(this.objversion, intrastatreportitem.objversion) &&
        Objects.equals(this.parentId, intrastatreportitem.parentId) &&
        Objects.equals(this.itemnumber, intrastatreportitem.itemnumber) &&
        Objects.equals(this.commoditiesId, intrastatreportitem.commoditiesId) &&
        Objects.equals(this.msconsdestId, intrastatreportitem.msconsdestId) &&
        Objects.equals(this.countryoforiginId, intrastatreportitem.countryoforiginId) &&
        Objects.equals(this.netmass, intrastatreportitem.netmass) &&
        Objects.equals(this.quantity, intrastatreportitem.quantity) &&
        Objects.equals(this.invoicedamount, intrastatreportitem.invoicedamount) &&
        Objects.equals(this.transactiontypeId, intrastatreportitem.transactiontypeId) &&
        Objects.equals(this.regionId, intrastatreportitem.regionId) &&
        Objects.equals(this.transportationId, intrastatreportitem.transportationId) &&
        Objects.equals(this.deliverytermId, intrastatreportitem.deliverytermId) &&
        Objects.equals(this.extratypeId, intrastatreportitem.extratypeId) &&
        Objects.equals(this.functioncode, intrastatreportitem.functioncode) &&
        Objects.equals(this.previousdeclarationId, intrastatreportitem.previousdeclarationId) &&
        Objects.equals(this.functioncodeText, intrastatreportitem.functioncodeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, itemnumber, commoditiesId, msconsdestId, countryoforiginId, netmass, quantity, invoicedamount, transactiontypeId, regionId, transportationId, deliverytermId, extratypeId, functioncode, previousdeclarationId, functioncodeText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intrastatreportitem {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    itemnumber: ").append(toIndentedString(itemnumber)).append("\n");
    sb.append("    commoditiesId: ").append(toIndentedString(commoditiesId)).append("\n");
    sb.append("    msconsdestId: ").append(toIndentedString(msconsdestId)).append("\n");
    sb.append("    countryoforiginId: ").append(toIndentedString(countryoforiginId)).append("\n");
    sb.append("    netmass: ").append(toIndentedString(netmass)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    invoicedamount: ").append(toIndentedString(invoicedamount)).append("\n");
    sb.append("    transactiontypeId: ").append(toIndentedString(transactiontypeId)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    transportationId: ").append(toIndentedString(transportationId)).append("\n");
    sb.append("    deliverytermId: ").append(toIndentedString(deliverytermId)).append("\n");
    sb.append("    extratypeId: ").append(toIndentedString(extratypeId)).append("\n");
    sb.append("    functioncode: ").append(toIndentedString(functioncode)).append("\n");
    sb.append("    previousdeclarationId: ").append(toIndentedString(previousdeclarationId)).append("\n");
    sb.append("    functioncodeText: ").append(toIndentedString(functioncodeText)).append("\n");
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

