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
 * Gpmcateringunitrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Gpmcateringunitrow   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Parent_ID")
  private String parentID = null;

  @SerializedName("PosIndex")
  private Integer posIndex = null;

  @SerializedName("PlanedUnitPrice")
  private Double planedUnitPrice = null;

  @SerializedName("BoardersCount")
  private Double boardersCount = null;

  @SerializedName("TotalPlanedPartialCosts")
  private Double totalPlanedPartialCosts = null;

  @SerializedName("Description")
  private String description = null;

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

   /**
   * Vlastník; ID objektu Stravní jednotka [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Stravní jednotka [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Gpmcateringunitrow posIndex(Integer posIndex) {
    this.posIndex = posIndex;
    return this;
  }

   /**
   * Pořadí [persistentní položka]
   * @return posIndex
  **/
  @ApiModelProperty(example = "null", value = "Pořadí [persistentní položka]")
  public Integer getPosIndex() {
    return posIndex;
  }

  public void setPosIndex(Integer posIndex) {
    this.posIndex = posIndex;
  }

  public Gpmcateringunitrow planedUnitPrice(Double planedUnitPrice) {
    this.planedUnitPrice = planedUnitPrice;
    return this;
  }

   /**
   * Jednotková cena plánovaných nákladů [persistentní položka]
   * @return planedUnitPrice
  **/
  @ApiModelProperty(example = "null", value = "Jednotková cena plánovaných nákladů [persistentní položka]")
  public Double getPlanedUnitPrice() {
    return planedUnitPrice;
  }

  public void setPlanedUnitPrice(Double planedUnitPrice) {
    this.planedUnitPrice = planedUnitPrice;
  }

  public Gpmcateringunitrow boardersCount(Double boardersCount) {
    this.boardersCount = boardersCount;
    return this;
  }

   /**
   * Počet strávníků [persistentní položka]
   * @return boardersCount
  **/
  @ApiModelProperty(example = "null", value = "Počet strávníků [persistentní položka]")
  public Double getBoardersCount() {
    return boardersCount;
  }

  public void setBoardersCount(Double boardersCount) {
    this.boardersCount = boardersCount;
  }

  public Gpmcateringunitrow totalPlanedPartialCosts(Double totalPlanedPartialCosts) {
    this.totalPlanedPartialCosts = totalPlanedPartialCosts;
    return this;
  }

   /**
   * Plánované náklady na dílčí SJ
   * @return totalPlanedPartialCosts
  **/
  @ApiModelProperty(example = "null", value = "Plánované náklady na dílčí SJ")
  public Double getTotalPlanedPartialCosts() {
    return totalPlanedPartialCosts;
  }

  public void setTotalPlanedPartialCosts(Double totalPlanedPartialCosts) {
    this.totalPlanedPartialCosts = totalPlanedPartialCosts;
  }

  public Gpmcateringunitrow description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Popis [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Popis [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gpmcateringunitrow gpmcateringunitrow = (Gpmcateringunitrow) o;
    return Objects.equals(this.displayName, gpmcateringunitrow.displayName) &&
        Objects.equals(this.ID, gpmcateringunitrow.ID) &&
        Objects.equals(this.classID, gpmcateringunitrow.classID) &&
        Objects.equals(this.objVersion, gpmcateringunitrow.objVersion) &&
        Objects.equals(this.parentID, gpmcateringunitrow.parentID) &&
        Objects.equals(this.posIndex, gpmcateringunitrow.posIndex) &&
        Objects.equals(this.planedUnitPrice, gpmcateringunitrow.planedUnitPrice) &&
        Objects.equals(this.boardersCount, gpmcateringunitrow.boardersCount) &&
        Objects.equals(this.totalPlanedPartialCosts, gpmcateringunitrow.totalPlanedPartialCosts) &&
        Objects.equals(this.description, gpmcateringunitrow.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, planedUnitPrice, boardersCount, totalPlanedPartialCosts, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gpmcateringunitrow {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    planedUnitPrice: ").append(toIndentedString(planedUnitPrice)).append("\n");
    sb.append("    boardersCount: ").append(toIndentedString(boardersCount)).append("\n");
    sb.append("    totalPlanedPartialCosts: ").append(toIndentedString(totalPlanedPartialCosts)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

