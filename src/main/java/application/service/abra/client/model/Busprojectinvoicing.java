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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Busprojectinvoicing
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Busprojectinvoicing   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Busprojectinvoicingrow> rows = new ArrayList<Busprojectinvoicingrow>();

  @SerializedName("storecard_id")
  private String storecardId = null;

  @SerializedName("storeunit_id")
  private String storeunitId = null;

  @SerializedName("quantitytoinvoice")
  private Double quantitytoinvoice = null;

  @SerializedName("amounttoinvoice")
  private Double amounttoinvoice = null;

  @SerializedName("quantitycorrection")
  private Double quantitycorrection = null;

  @SerializedName("amountcorrection")
  private Double amountcorrection = null;

  @SerializedName("busobject_id")
  private String busobjectId = null;

  @SerializedName("source_id")
  private String sourceId = null;

  public Busprojectinvoicing displayname(String displayname) {
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

  public Busprojectinvoicing id(String id) {
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

  public Busprojectinvoicing classid(String classid) {
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

  public Busprojectinvoicing objversion(Integer objversion) {
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

  public Busprojectinvoicing rows(List<Busprojectinvoicingrow> rows) {
    this.rows = rows;
    return this;
  }

  public Busprojectinvoicing addRowsItem(Busprojectinvoicingrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo projekt - řádek vyúčtování fakturace [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo projekt - řádek vyúčtování fakturace [nepersistentní položka]")
  public List<Busprojectinvoicingrow> getRows() {
    return rows;
  }

  public void setRows(List<Busprojectinvoicingrow> rows) {
    this.rows = rows;
  }

  public Busprojectinvoicing storecardId(String storecardId) {
    this.storecardId = storecardId;
    return this;
  }

   /**
   * skladová karta; id objektu skladová karta [persistentní položka]
   * @return storecardId
  **/
  @ApiModelProperty(example = "null", value = "skladová karta; id objektu skladová karta [persistentní položka]")
  public String getStorecardId() {
    return storecardId;
  }

  public void setStorecardId(String storecardId) {
    this.storecardId = storecardId;
  }

  public Busprojectinvoicing storeunitId(String storeunitId) {
    this.storeunitId = storeunitId;
    return this;
  }

   /**
   * jed.; id objektu jednotka skladové karty [persistentní položka]
   * @return storeunitId
  **/
  @ApiModelProperty(example = "null", value = "jed.; id objektu jednotka skladové karty [persistentní položka]")
  public String getStoreunitId() {
    return storeunitId;
  }

  public void setStoreunitId(String storeunitId) {
    this.storeunitId = storeunitId;
  }

  public Busprojectinvoicing quantitytoinvoice(Double quantitytoinvoice) {
    this.quantitytoinvoice = quantitytoinvoice;
    return this;
  }

   /**
   * množství k fak. [persistentní položka]
   * @return quantitytoinvoice
  **/
  @ApiModelProperty(example = "null", value = "množství k fak. [persistentní položka]")
  public Double getQuantitytoinvoice() {
    return quantitytoinvoice;
  }

  public void setQuantitytoinvoice(Double quantitytoinvoice) {
    this.quantitytoinvoice = quantitytoinvoice;
  }

  public Busprojectinvoicing amounttoinvoice(Double amounttoinvoice) {
    this.amounttoinvoice = amounttoinvoice;
    return this;
  }

   /**
   * Částka k fak. [persistentní položka]
   * @return amounttoinvoice
  **/
  @ApiModelProperty(example = "null", value = "Částka k fak. [persistentní položka]")
  public Double getAmounttoinvoice() {
    return amounttoinvoice;
  }

  public void setAmounttoinvoice(Double amounttoinvoice) {
    this.amounttoinvoice = amounttoinvoice;
  }

  public Busprojectinvoicing quantitycorrection(Double quantitycorrection) {
    this.quantitycorrection = quantitycorrection;
    return this;
  }

   /**
   * množství-korekce [persistentní položka]
   * @return quantitycorrection
  **/
  @ApiModelProperty(example = "null", value = "množství-korekce [persistentní položka]")
  public Double getQuantitycorrection() {
    return quantitycorrection;
  }

  public void setQuantitycorrection(Double quantitycorrection) {
    this.quantitycorrection = quantitycorrection;
  }

  public Busprojectinvoicing amountcorrection(Double amountcorrection) {
    this.amountcorrection = amountcorrection;
    return this;
  }

   /**
   * Částka-korekce [persistentní položka]
   * @return amountcorrection
  **/
  @ApiModelProperty(example = "null", value = "Částka-korekce [persistentní položka]")
  public Double getAmountcorrection() {
    return amountcorrection;
  }

  public void setAmountcorrection(Double amountcorrection) {
    this.amountcorrection = amountcorrection;
  }

  public Busprojectinvoicing busobjectId(String busobjectId) {
    this.busobjectId = busobjectId;
    return this;
  }

   /**
   * projekt; id objektu projekt [persistentní položka]
   * @return busobjectId
  **/
  @ApiModelProperty(example = "null", value = "projekt; id objektu projekt [persistentní položka]")
  public String getBusobjectId() {
    return busobjectId;
  }

  public void setBusobjectId(String busobjectId) {
    this.busobjectId = busobjectId;
  }

  public Busprojectinvoicing sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * zdroj; id objektu projekt - zdroj [persistentní položka]
   * @return sourceId
  **/
  @ApiModelProperty(example = "null", value = "zdroj; id objektu projekt - zdroj [persistentní položka]")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Busprojectinvoicing busprojectinvoicing = (Busprojectinvoicing) o;
    return Objects.equals(this.displayname, busprojectinvoicing.displayname) &&
        Objects.equals(this.id, busprojectinvoicing.id) &&
        Objects.equals(this.classid, busprojectinvoicing.classid) &&
        Objects.equals(this.objversion, busprojectinvoicing.objversion) &&
        Objects.equals(this.rows, busprojectinvoicing.rows) &&
        Objects.equals(this.storecardId, busprojectinvoicing.storecardId) &&
        Objects.equals(this.storeunitId, busprojectinvoicing.storeunitId) &&
        Objects.equals(this.quantitytoinvoice, busprojectinvoicing.quantitytoinvoice) &&
        Objects.equals(this.amounttoinvoice, busprojectinvoicing.amounttoinvoice) &&
        Objects.equals(this.quantitycorrection, busprojectinvoicing.quantitycorrection) &&
        Objects.equals(this.amountcorrection, busprojectinvoicing.amountcorrection) &&
        Objects.equals(this.busobjectId, busprojectinvoicing.busobjectId) &&
        Objects.equals(this.sourceId, busprojectinvoicing.sourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, storecardId, storeunitId, quantitytoinvoice, amounttoinvoice, quantitycorrection, amountcorrection, busobjectId, sourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Busprojectinvoicing {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    storecardId: ").append(toIndentedString(storecardId)).append("\n");
    sb.append("    storeunitId: ").append(toIndentedString(storeunitId)).append("\n");
    sb.append("    quantitytoinvoice: ").append(toIndentedString(quantitytoinvoice)).append("\n");
    sb.append("    amounttoinvoice: ").append(toIndentedString(amounttoinvoice)).append("\n");
    sb.append("    quantitycorrection: ").append(toIndentedString(quantitycorrection)).append("\n");
    sb.append("    amountcorrection: ").append(toIndentedString(amountcorrection)).append("\n");
    sb.append("    busobjectId: ").append(toIndentedString(busobjectId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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

