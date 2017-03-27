/**
 * ABRA Gen Web API (spojení testapi)
 * Webové API systému 17.03.03
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
 * Serviceworkcategory
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Serviceworkcategory   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Hidden")
  private Boolean hidden = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("AmountPerHour")
  private Double amountPerHour = null;

  @SerializedName("AmountPerHourWithVAT")
  private Double amountPerHourWithVAT = null;

  @SerializedName("CostPriceWithoutVAT")
  private Double costPriceWithoutVAT = null;

  @SerializedName("CostPriceWithVAT")
  private Double costPriceWithVAT = null;

  @SerializedName("VATRate_ID")
  private String vATRateID = null;

  @SerializedName("Rows")
  private List<Serviceworkcategoryrow> rows = new ArrayList<Serviceworkcategoryrow>();

   /**
   * Název
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Název")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Vlastní ID [persistentní položka]
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "Vlastní ID [persistentní položka]")
  public String getID() {
    return ID;
  }

   /**
   * ID třídy
   * @return classID
  **/
  @ApiModelProperty(example = "null", value = "ID třídy")
  public String getClassID() {
    return classID;
  }

   /**
   * Verze objektu [persistentní položka]
   * @return objVersion
  **/
  @ApiModelProperty(example = "null", value = "Verze objektu [persistentní položka]")
  public Integer getObjVersion() {
    return objVersion;
  }

  public Serviceworkcategory hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Skrytý [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "Skrytý [persistentní položka]")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Serviceworkcategory code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "Kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Serviceworkcategory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Serviceworkcategory amountPerHour(Double amountPerHour) {
    this.amountPerHour = amountPerHour;
    return this;
  }

   /**
   * Hodinová sazba bez DPH [persistentní položka]
   * @return amountPerHour
  **/
  @ApiModelProperty(example = "null", value = "Hodinová sazba bez DPH [persistentní položka]")
  public Double getAmountPerHour() {
    return amountPerHour;
  }

  public void setAmountPerHour(Double amountPerHour) {
    this.amountPerHour = amountPerHour;
  }

  public Serviceworkcategory amountPerHourWithVAT(Double amountPerHourWithVAT) {
    this.amountPerHourWithVAT = amountPerHourWithVAT;
    return this;
  }

   /**
   * Hodinová sazba s daní [persistentní položka]
   * @return amountPerHourWithVAT
  **/
  @ApiModelProperty(example = "null", value = "Hodinová sazba s daní [persistentní položka]")
  public Double getAmountPerHourWithVAT() {
    return amountPerHourWithVAT;
  }

  public void setAmountPerHourWithVAT(Double amountPerHourWithVAT) {
    this.amountPerHourWithVAT = amountPerHourWithVAT;
  }

  public Serviceworkcategory costPriceWithoutVAT(Double costPriceWithoutVAT) {
    this.costPriceWithoutVAT = costPriceWithoutVAT;
    return this;
  }

   /**
   * Nákl.cena bez daně [persistentní položka]
   * @return costPriceWithoutVAT
  **/
  @ApiModelProperty(example = "null", value = "Nákl.cena bez daně [persistentní položka]")
  public Double getCostPriceWithoutVAT() {
    return costPriceWithoutVAT;
  }

  public void setCostPriceWithoutVAT(Double costPriceWithoutVAT) {
    this.costPriceWithoutVAT = costPriceWithoutVAT;
  }

  public Serviceworkcategory costPriceWithVAT(Double costPriceWithVAT) {
    this.costPriceWithVAT = costPriceWithVAT;
    return this;
  }

   /**
   * Nákl.cena s daní [persistentní položka]
   * @return costPriceWithVAT
  **/
  @ApiModelProperty(example = "null", value = "Nákl.cena s daní [persistentní položka]")
  public Double getCostPriceWithVAT() {
    return costPriceWithVAT;
  }

  public void setCostPriceWithVAT(Double costPriceWithVAT) {
    this.costPriceWithVAT = costPriceWithVAT;
  }

  public Serviceworkcategory vATRateID(String vATRateID) {
    this.vATRateID = vATRateID;
    return this;
  }

   /**
   * Sazba DPH; ID objektu DPH sazba [persistentní položka]
   * @return vATRateID
  **/
  @ApiModelProperty(example = "null", value = "Sazba DPH; ID objektu DPH sazba [persistentní položka]")
  public String getVATRateID() {
    return vATRateID;
  }

  public void setVATRateID(String vATRateID) {
    this.vATRateID = vATRateID;
  }

  public Serviceworkcategory rows(List<Serviceworkcategoryrow> rows) {
    this.rows = rows;
    return this;
  }

  public Serviceworkcategory addRowsItem(Serviceworkcategoryrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * řádek; kolekce BO Řádek servisní odbornosti [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "řádek; kolekce BO Řádek servisní odbornosti [nepersistentní položka]")
  public List<Serviceworkcategoryrow> getRows() {
    return rows;
  }

  public void setRows(List<Serviceworkcategoryrow> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Serviceworkcategory serviceworkcategory = (Serviceworkcategory) o;
    return Objects.equals(this.displayName, serviceworkcategory.displayName) &&
        Objects.equals(this.ID, serviceworkcategory.ID) &&
        Objects.equals(this.classID, serviceworkcategory.classID) &&
        Objects.equals(this.objVersion, serviceworkcategory.objVersion) &&
        Objects.equals(this.hidden, serviceworkcategory.hidden) &&
        Objects.equals(this.code, serviceworkcategory.code) &&
        Objects.equals(this.name, serviceworkcategory.name) &&
        Objects.equals(this.amountPerHour, serviceworkcategory.amountPerHour) &&
        Objects.equals(this.amountPerHourWithVAT, serviceworkcategory.amountPerHourWithVAT) &&
        Objects.equals(this.costPriceWithoutVAT, serviceworkcategory.costPriceWithoutVAT) &&
        Objects.equals(this.costPriceWithVAT, serviceworkcategory.costPriceWithVAT) &&
        Objects.equals(this.vATRateID, serviceworkcategory.vATRateID) &&
        Objects.equals(this.rows, serviceworkcategory.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, hidden, code, name, amountPerHour, amountPerHourWithVAT, costPriceWithoutVAT, costPriceWithVAT, vATRateID, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Serviceworkcategory {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amountPerHour: ").append(toIndentedString(amountPerHour)).append("\n");
    sb.append("    amountPerHourWithVAT: ").append(toIndentedString(amountPerHourWithVAT)).append("\n");
    sb.append("    costPriceWithoutVAT: ").append(toIndentedString(costPriceWithoutVAT)).append("\n");
    sb.append("    costPriceWithVAT: ").append(toIndentedString(costPriceWithVAT)).append("\n");
    sb.append("    vATRateID: ").append(toIndentedString(vATRateID)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

