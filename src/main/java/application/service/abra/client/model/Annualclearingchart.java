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
 * Annualclearingchart
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Annualclearingchart   {
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

  @SerializedName("CalcChart_ID")
  private String calcChartID = null;

  @SerializedName("CLSID")
  private String CLSID = null;

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
   * Vlastník; ID objektu Řádek ročního zúčtování [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Řádek ročního zúčtování [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Annualclearingchart posIndex(Integer posIndex) {
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

  public Annualclearingchart calcChartID(String calcChartID) {
    this.calcChartID = calcChartID;
    return this;
  }

   /**
   * Výpočtové schéma; ID objektu Výpočtové schéma [persistentní položka]
   * @return calcChartID
  **/
  @ApiModelProperty(example = "null", value = "Výpočtové schéma; ID objektu Výpočtové schéma [persistentní položka]")
  public String getCalcChartID() {
    return calcChartID;
  }

  public void setCalcChartID(String calcChartID) {
    this.calcChartID = calcChartID;
  }

  public Annualclearingchart CLSID(String CLSID) {
    this.CLSID = CLSID;
    return this;
  }

   /**
   * Třída
   * @return CLSID
  **/
  @ApiModelProperty(example = "null", value = "Třída")
  public String getCLSID() {
    return CLSID;
  }

  public void setCLSID(String CLSID) {
    this.CLSID = CLSID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Annualclearingchart annualclearingchart = (Annualclearingchart) o;
    return Objects.equals(this.displayName, annualclearingchart.displayName) &&
        Objects.equals(this.ID, annualclearingchart.ID) &&
        Objects.equals(this.classID, annualclearingchart.classID) &&
        Objects.equals(this.objVersion, annualclearingchart.objVersion) &&
        Objects.equals(this.parentID, annualclearingchart.parentID) &&
        Objects.equals(this.posIndex, annualclearingchart.posIndex) &&
        Objects.equals(this.calcChartID, annualclearingchart.calcChartID) &&
        Objects.equals(this.CLSID, annualclearingchart.CLSID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, calcChartID, CLSID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Annualclearingchart {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    calcChartID: ").append(toIndentedString(calcChartID)).append("\n");
    sb.append("    CLSID: ").append(toIndentedString(CLSID)).append("\n");
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

