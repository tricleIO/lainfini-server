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

import java.util.Objects;


/**
 * Expensetype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Expensetype   {
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

  @SerializedName("AnalyticalAccount")
  private String analyticalAccount = null;

  @SerializedName("Category")
  private Integer category = null;

  @SerializedName("BookColumn")
  private Integer bookColumn = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EETKind")
  private Integer eETKind = null;

  @SerializedName("Parent_ID")
  private String parentID = null;

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

  public Expensetype hidden(Boolean hidden) {
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

  public Expensetype code(String code) {
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

  public Expensetype name(String name) {
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

  public Expensetype analyticalAccount(String analyticalAccount) {
    this.analyticalAccount = analyticalAccount;
    return this;
  }

   /**
   * Analytika [persistentní položka]
   * @return analyticalAccount
  **/
  @ApiModelProperty(example = "null", value = "Analytika [persistentní položka]")
  public String getAnalyticalAccount() {
    return analyticalAccount;
  }

  public void setAnalyticalAccount(String analyticalAccount) {
    this.analyticalAccount = analyticalAccount;
  }

  public Expensetype category(Integer category) {
    this.category = category;
    return this;
  }

   /**
   * Kategorie [persistentní položka]
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "Kategorie [persistentní položka]")
  public Integer getCategory() {
    return category;
  }

  public void setCategory(Integer category) {
    this.category = category;
  }

  public Expensetype bookColumn(Integer bookColumn) {
    this.bookColumn = bookColumn;
    return this;
  }

   /**
   * Sloupec deníku [persistentní položka]
   * @return bookColumn
  **/
  @ApiModelProperty(example = "null", value = "Sloupec deníku [persistentní položka]")
  public Integer getBookColumn() {
    return bookColumn;
  }

  public void setBookColumn(Integer bookColumn) {
    this.bookColumn = bookColumn;
  }

  public Expensetype description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Poznámka [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Poznámka [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Expensetype eETKind(Integer eETKind) {
    this.eETKind = eETKind;
    return this;
  }

   /**
   * EET druh [persistentní položka]
   * @return eETKind
  **/
  @ApiModelProperty(example = "null", value = "EET druh [persistentní položka]")
  public Integer getEETKind() {
    return eETKind;
  }

  public void setEETKind(Integer eETKind) {
    this.eETKind = eETKind;
  }

  public Expensetype parentID(String parentID) {
    this.parentID = parentID;
    return this;
  }

   /**
   * Nadřízený; ID objektu Typ výdaje [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Nadřízený; ID objektu Typ výdaje [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public void setParentID(String parentID) {
    this.parentID = parentID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expensetype expensetype = (Expensetype) o;
    return Objects.equals(this.displayName, expensetype.displayName) &&
        Objects.equals(this.ID, expensetype.ID) &&
        Objects.equals(this.classID, expensetype.classID) &&
        Objects.equals(this.objVersion, expensetype.objVersion) &&
        Objects.equals(this.hidden, expensetype.hidden) &&
        Objects.equals(this.code, expensetype.code) &&
        Objects.equals(this.name, expensetype.name) &&
        Objects.equals(this.analyticalAccount, expensetype.analyticalAccount) &&
        Objects.equals(this.category, expensetype.category) &&
        Objects.equals(this.bookColumn, expensetype.bookColumn) &&
        Objects.equals(this.description, expensetype.description) &&
        Objects.equals(this.eETKind, expensetype.eETKind) &&
        Objects.equals(this.parentID, expensetype.parentID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, hidden, code, name, analyticalAccount, category, bookColumn, description, eETKind, parentID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expensetype {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    analyticalAccount: ").append(toIndentedString(analyticalAccount)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    bookColumn: ").append(toIndentedString(bookColumn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eETKind: ").append(toIndentedString(eETKind)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
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

