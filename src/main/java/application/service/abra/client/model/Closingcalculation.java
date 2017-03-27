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
 * Closingcalculation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Closingcalculation   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Rows")
  private List<Notpositionedrowbusinessobject> rows = new ArrayList<Notpositionedrowbusinessobject>();

  @SerializedName("CalcCharts")
  private List<Calcclosingchartlist> calcCharts = new ArrayList<Calcclosingchartlist>();

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("WagePeriod_ID")
  private String wagePeriodID = null;

  @SerializedName("Employee_ID")
  private String employeeID = null;

  @SerializedName("WorkingRelation_ID")
  private String workingRelationID = null;

  @SerializedName("Dock_ID")
  private String dockID = null;

  @SerializedName("SupressWList")
  private Integer supressWList = null;

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

  public Closingcalculation rows(List<Notpositionedrowbusinessobject> rows) {
    this.rows = rows;
    return this;
  }

  public Closingcalculation addRowsItem(Notpositionedrowbusinessobject rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce BO Řádek bez pořadí [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce BO Řádek bez pořadí [nepersistentní položka]")
  public List<Notpositionedrowbusinessobject> getRows() {
    return rows;
  }

  public void setRows(List<Notpositionedrowbusinessobject> rows) {
    this.rows = rows;
  }

  public Closingcalculation calcCharts(List<Calcclosingchartlist> calcCharts) {
    this.calcCharts = calcCharts;
    return this;
  }

  public Closingcalculation addCalcChartsItem(Calcclosingchartlist calcChartsItem) {
    this.calcCharts.add(calcChartsItem);
    return this;
  }

   /**
   * Výpočtová schémata; kolekce BO Schéma pro výpočet uzávěrky [nepersistentní položka]
   * @return calcCharts
  **/
  @ApiModelProperty(example = "null", value = "Výpočtová schémata; kolekce BO Schéma pro výpočet uzávěrky [nepersistentní položka]")
  public List<Calcclosingchartlist> getCalcCharts() {
    return calcCharts;
  }

  public void setCalcCharts(List<Calcclosingchartlist> calcCharts) {
    this.calcCharts = calcCharts;
  }

  public Closingcalculation amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Částka
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Částka")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Closingcalculation wagePeriodID(String wagePeriodID) {
    this.wagePeriodID = wagePeriodID;
    return this;
  }

   /**
   * Mzdové období; ID objektu Mzdové období
   * @return wagePeriodID
  **/
  @ApiModelProperty(example = "null", value = "Mzdové období; ID objektu Mzdové období")
  public String getWagePeriodID() {
    return wagePeriodID;
  }

  public void setWagePeriodID(String wagePeriodID) {
    this.wagePeriodID = wagePeriodID;
  }

  public Closingcalculation employeeID(String employeeID) {
    this.employeeID = employeeID;
    return this;
  }

   /**
   * Zaměstnanec; ID objektu Zaměstnanec
   * @return employeeID
  **/
  @ApiModelProperty(example = "null", value = "Zaměstnanec; ID objektu Zaměstnanec")
  public String getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(String employeeID) {
    this.employeeID = employeeID;
  }

  public Closingcalculation workingRelationID(String workingRelationID) {
    this.workingRelationID = workingRelationID;
    return this;
  }

   /**
   * Pracovní poměr; ID objektu Pracovní poměr
   * @return workingRelationID
  **/
  @ApiModelProperty(example = "null", value = "Pracovní poměr; ID objektu Pracovní poměr")
  public String getWorkingRelationID() {
    return workingRelationID;
  }

  public void setWorkingRelationID(String workingRelationID) {
    this.workingRelationID = workingRelationID;
  }

  public Closingcalculation dockID(String dockID) {
    this.dockID = dockID;
    return this;
  }

   /**
   * Srážka; ID objektu Srážka [persistentní položka]
   * @return dockID
  **/
  @ApiModelProperty(example = "null", value = "Srážka; ID objektu Srážka [persistentní položka]")
  public String getDockID() {
    return dockID;
  }

  public void setDockID(String dockID) {
    this.dockID = dockID;
  }

  public Closingcalculation supressWList(Integer supressWList) {
    this.supressWList = supressWList;
    return this;
  }

   /**
   * Zpracovávaný objekt
   * @return supressWList
  **/
  @ApiModelProperty(example = "null", value = "Zpracovávaný objekt")
  public Integer getSupressWList() {
    return supressWList;
  }

  public void setSupressWList(Integer supressWList) {
    this.supressWList = supressWList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Closingcalculation closingcalculation = (Closingcalculation) o;
    return Objects.equals(this.displayName, closingcalculation.displayName) &&
        Objects.equals(this.ID, closingcalculation.ID) &&
        Objects.equals(this.classID, closingcalculation.classID) &&
        Objects.equals(this.objVersion, closingcalculation.objVersion) &&
        Objects.equals(this.rows, closingcalculation.rows) &&
        Objects.equals(this.calcCharts, closingcalculation.calcCharts) &&
        Objects.equals(this.amount, closingcalculation.amount) &&
        Objects.equals(this.wagePeriodID, closingcalculation.wagePeriodID) &&
        Objects.equals(this.employeeID, closingcalculation.employeeID) &&
        Objects.equals(this.workingRelationID, closingcalculation.workingRelationID) &&
        Objects.equals(this.dockID, closingcalculation.dockID) &&
        Objects.equals(this.supressWList, closingcalculation.supressWList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, rows, calcCharts, amount, wagePeriodID, employeeID, workingRelationID, dockID, supressWList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Closingcalculation {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    calcCharts: ").append(toIndentedString(calcCharts)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    wagePeriodID: ").append(toIndentedString(wagePeriodID)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    workingRelationID: ").append(toIndentedString(workingRelationID)).append("\n");
    sb.append("    dockID: ").append(toIndentedString(dockID)).append("\n");
    sb.append("    supressWList: ").append(toIndentedString(supressWList)).append("\n");
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

