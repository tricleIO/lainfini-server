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
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * Busorderfreal
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Busorderfreal   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("BusObject_ID")
  private String busObjectID = null;

  @SerializedName("EvaluationDate$DATE")
  private DateTime evaluationDateDATE = null;

  @SerializedName("RealCosts")
  private Double realCosts = null;

  @SerializedName("RealRevenues")
  private Double realRevenues = null;

  @SerializedName("RealCostsWithSubTree")
  private Double realCostsWithSubTree = null;

  @SerializedName("RealRevenuesWithSubTree")
  private Double realRevenuesWithSubTree = null;

  @SerializedName("RealCostsFromSources")
  private Double realCostsFromSources = null;

  @SerializedName("RealCostsFromSourcesWSubTree")
  private Double realCostsFromSourcesWSubTree = null;

  @SerializedName("CalculatedBy_ID")
  private String calculatedByID = null;

  @SerializedName("CalculatedWhen$DATE")
  private DateTime calculatedWhenDATE = null;

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

  public Busorderfreal busObjectID(String busObjectID) {
    this.busObjectID = busObjectID;
    return this;
  }

   /**
   * Nadřízený objekt; ID objektu Zakázka [persistentní položka]
   * @return busObjectID
  **/
  @ApiModelProperty(example = "null", value = "Nadřízený objekt; ID objektu Zakázka [persistentní položka]")
  public String getBusObjectID() {
    return busObjectID;
  }

  public void setBusObjectID(String busObjectID) {
    this.busObjectID = busObjectID;
  }

  public Busorderfreal evaluationDateDATE(DateTime evaluationDateDATE) {
    this.evaluationDateDATE = evaluationDateDATE;
    return this;
  }

   /**
   * Datum vyhodnocení [persistentní položka]
   * @return evaluationDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum vyhodnocení [persistentní položka]")
  public DateTime getEvaluationDateDATE() {
    return evaluationDateDATE;
  }

  public void setEvaluationDateDATE(DateTime evaluationDateDATE) {
    this.evaluationDateDATE = evaluationDateDATE;
  }

  public Busorderfreal realCosts(Double realCosts) {
    this.realCosts = realCosts;
    return this;
  }

   /**
   * Reálné náklady [persistentní položka]
   * @return realCosts
  **/
  @ApiModelProperty(example = "null", value = "Reálné náklady [persistentní položka]")
  public Double getRealCosts() {
    return realCosts;
  }

  public void setRealCosts(Double realCosts) {
    this.realCosts = realCosts;
  }

  public Busorderfreal realRevenues(Double realRevenues) {
    this.realRevenues = realRevenues;
    return this;
  }

   /**
   * Reálné výnosy [persistentní položka]
   * @return realRevenues
  **/
  @ApiModelProperty(example = "null", value = "Reálné výnosy [persistentní položka]")
  public Double getRealRevenues() {
    return realRevenues;
  }

  public void setRealRevenues(Double realRevenues) {
    this.realRevenues = realRevenues;
  }

  public Busorderfreal realCostsWithSubTree(Double realCostsWithSubTree) {
    this.realCostsWithSubTree = realCostsWithSubTree;
    return this;
  }

   /**
   * Reálné náklady vč.podřízených [persistentní položka]
   * @return realCostsWithSubTree
  **/
  @ApiModelProperty(example = "null", value = "Reálné náklady vč.podřízených [persistentní položka]")
  public Double getRealCostsWithSubTree() {
    return realCostsWithSubTree;
  }

  public void setRealCostsWithSubTree(Double realCostsWithSubTree) {
    this.realCostsWithSubTree = realCostsWithSubTree;
  }

  public Busorderfreal realRevenuesWithSubTree(Double realRevenuesWithSubTree) {
    this.realRevenuesWithSubTree = realRevenuesWithSubTree;
    return this;
  }

   /**
   * Reálné výnosy vč.podřízených [persistentní položka]
   * @return realRevenuesWithSubTree
  **/
  @ApiModelProperty(example = "null", value = "Reálné výnosy vč.podřízených [persistentní položka]")
  public Double getRealRevenuesWithSubTree() {
    return realRevenuesWithSubTree;
  }

  public void setRealRevenuesWithSubTree(Double realRevenuesWithSubTree) {
    this.realRevenuesWithSubTree = realRevenuesWithSubTree;
  }

  public Busorderfreal realCostsFromSources(Double realCostsFromSources) {
    this.realCostsFromSources = realCostsFromSources;
    return this;
  }

   /**
   * Reálné náklady zdrojů [persistentní položka]
   * @return realCostsFromSources
  **/
  @ApiModelProperty(example = "null", value = "Reálné náklady zdrojů [persistentní položka]")
  public Double getRealCostsFromSources() {
    return realCostsFromSources;
  }

  public void setRealCostsFromSources(Double realCostsFromSources) {
    this.realCostsFromSources = realCostsFromSources;
  }

  public Busorderfreal realCostsFromSourcesWSubTree(Double realCostsFromSourcesWSubTree) {
    this.realCostsFromSourcesWSubTree = realCostsFromSourcesWSubTree;
    return this;
  }

   /**
   * Reálné náklady zdrojů vč.podřízených [persistentní položka]
   * @return realCostsFromSourcesWSubTree
  **/
  @ApiModelProperty(example = "null", value = "Reálné náklady zdrojů vč.podřízených [persistentní položka]")
  public Double getRealCostsFromSourcesWSubTree() {
    return realCostsFromSourcesWSubTree;
  }

  public void setRealCostsFromSourcesWSubTree(Double realCostsFromSourcesWSubTree) {
    this.realCostsFromSourcesWSubTree = realCostsFromSourcesWSubTree;
  }

  public Busorderfreal calculatedByID(String calculatedByID) {
    this.calculatedByID = calculatedByID;
    return this;
  }

   /**
   * Bilanci spočítal; ID objektu Uživatel [persistentní položka]
   * @return calculatedByID
  **/
  @ApiModelProperty(example = "null", value = "Bilanci spočítal; ID objektu Uživatel [persistentní položka]")
  public String getCalculatedByID() {
    return calculatedByID;
  }

  public void setCalculatedByID(String calculatedByID) {
    this.calculatedByID = calculatedByID;
  }

  public Busorderfreal calculatedWhenDATE(DateTime calculatedWhenDATE) {
    this.calculatedWhenDATE = calculatedWhenDATE;
    return this;
  }

   /**
   * Datum posl.výpočtu [persistentní položka]
   * @return calculatedWhenDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum posl.výpočtu [persistentní položka]")
  public DateTime getCalculatedWhenDATE() {
    return calculatedWhenDATE;
  }

  public void setCalculatedWhenDATE(DateTime calculatedWhenDATE) {
    this.calculatedWhenDATE = calculatedWhenDATE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Busorderfreal busorderfreal = (Busorderfreal) o;
    return Objects.equals(this.displayName, busorderfreal.displayName) &&
        Objects.equals(this.ID, busorderfreal.ID) &&
        Objects.equals(this.classID, busorderfreal.classID) &&
        Objects.equals(this.objVersion, busorderfreal.objVersion) &&
        Objects.equals(this.busObjectID, busorderfreal.busObjectID) &&
        Objects.equals(this.evaluationDateDATE, busorderfreal.evaluationDateDATE) &&
        Objects.equals(this.realCosts, busorderfreal.realCosts) &&
        Objects.equals(this.realRevenues, busorderfreal.realRevenues) &&
        Objects.equals(this.realCostsWithSubTree, busorderfreal.realCostsWithSubTree) &&
        Objects.equals(this.realRevenuesWithSubTree, busorderfreal.realRevenuesWithSubTree) &&
        Objects.equals(this.realCostsFromSources, busorderfreal.realCostsFromSources) &&
        Objects.equals(this.realCostsFromSourcesWSubTree, busorderfreal.realCostsFromSourcesWSubTree) &&
        Objects.equals(this.calculatedByID, busorderfreal.calculatedByID) &&
        Objects.equals(this.calculatedWhenDATE, busorderfreal.calculatedWhenDATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, busObjectID, evaluationDateDATE, realCosts, realRevenues, realCostsWithSubTree, realRevenuesWithSubTree, realCostsFromSources, realCostsFromSourcesWSubTree, calculatedByID, calculatedWhenDATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Busorderfreal {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    busObjectID: ").append(toIndentedString(busObjectID)).append("\n");
    sb.append("    evaluationDateDATE: ").append(toIndentedString(evaluationDateDATE)).append("\n");
    sb.append("    realCosts: ").append(toIndentedString(realCosts)).append("\n");
    sb.append("    realRevenues: ").append(toIndentedString(realRevenues)).append("\n");
    sb.append("    realCostsWithSubTree: ").append(toIndentedString(realCostsWithSubTree)).append("\n");
    sb.append("    realRevenuesWithSubTree: ").append(toIndentedString(realRevenuesWithSubTree)).append("\n");
    sb.append("    realCostsFromSources: ").append(toIndentedString(realCostsFromSources)).append("\n");
    sb.append("    realCostsFromSourcesWSubTree: ").append(toIndentedString(realCostsFromSourcesWSubTree)).append("\n");
    sb.append("    calculatedByID: ").append(toIndentedString(calculatedByID)).append("\n");
    sb.append("    calculatedWhenDATE: ").append(toIndentedString(calculatedWhenDATE)).append("\n");
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

