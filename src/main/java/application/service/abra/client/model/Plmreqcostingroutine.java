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
 * Plmreqcostingroutine
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Plmreqcostingroutine   {
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

  @SerializedName("WorkPlace_ID")
  private String workPlaceID = null;

  @SerializedName("Phase_ID")
  private String phaseID = null;

  @SerializedName("PartTime")
  private Double partTime = null;

  @SerializedName("SetupTime")
  private Double setupTime = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("Cooperation")
  private Boolean cooperation = null;

  @SerializedName("SalaryClass_ID")
  private String salaryClassID = null;

  @SerializedName("TotalTime")
  private Double totalTime = null;

  @SerializedName("Salary")
  private Double salary = null;

  @SerializedName("OverheadCosts")
  private Double overheadCosts = null;

  @SerializedName("GeneralExpense")
  private Double generalExpense = null;

  @SerializedName("TotalOverheads")
  private Double totalOverheads = null;

  @SerializedName("TAC")
  private Double TAC = null;

  @SerializedName("TBC")
  private Double TBC = null;

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
   * Vlastník; ID objektu Požadavek na výrobu - kalkulace vyráběná položka [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Požadavek na výrobu - kalkulace vyráběná položka [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Plmreqcostingroutine posIndex(Integer posIndex) {
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

  public Plmreqcostingroutine workPlaceID(String workPlaceID) {
    this.workPlaceID = workPlaceID;
    return this;
  }

   /**
   * Pracoviště; ID objektu Pracoviště a stroj [persistentní položka]
   * @return workPlaceID
  **/
  @ApiModelProperty(example = "null", value = "Pracoviště; ID objektu Pracoviště a stroj [persistentní položka]")
  public String getWorkPlaceID() {
    return workPlaceID;
  }

  public void setWorkPlaceID(String workPlaceID) {
    this.workPlaceID = workPlaceID;
  }

  public Plmreqcostingroutine phaseID(String phaseID) {
    this.phaseID = phaseID;
    return this;
  }

   /**
   * Etapa; ID objektu Etapa [persistentní položka]
   * @return phaseID
  **/
  @ApiModelProperty(example = "null", value = "Etapa; ID objektu Etapa [persistentní položka]")
  public String getPhaseID() {
    return phaseID;
  }

  public void setPhaseID(String phaseID) {
    this.phaseID = phaseID;
  }

  public Plmreqcostingroutine partTime(Double partTime) {
    this.partTime = partTime;
    return this;
  }

   /**
   * Kusový čas v minutách
   * @return partTime
  **/
  @ApiModelProperty(example = "null", value = "Kusový čas v minutách")
  public Double getPartTime() {
    return partTime;
  }

  public void setPartTime(Double partTime) {
    this.partTime = partTime;
  }

  public Plmreqcostingroutine setupTime(Double setupTime) {
    this.setupTime = setupTime;
    return this;
  }

   /**
   * Dávkový čas v minutách
   * @return setupTime
  **/
  @ApiModelProperty(example = "null", value = "Dávkový čas v minutách")
  public Double getSetupTime() {
    return setupTime;
  }

  public void setSetupTime(Double setupTime) {
    this.setupTime = setupTime;
  }

  public Plmreqcostingroutine title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Název [persistentní položka]
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "Název [persistentní položka]")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Plmreqcostingroutine cooperation(Boolean cooperation) {
    this.cooperation = cooperation;
    return this;
  }

   /**
   * Kooperace [persistentní položka]
   * @return cooperation
  **/
  @ApiModelProperty(example = "null", value = "Kooperace [persistentní položka]")
  public Boolean getCooperation() {
    return cooperation;
  }

  public void setCooperation(Boolean cooperation) {
    this.cooperation = cooperation;
  }

  public Plmreqcostingroutine salaryClassID(String salaryClassID) {
    this.salaryClassID = salaryClassID;
    return this;
  }

   /**
   * Tarifní třída; ID objektu Tarifní třída [persistentní položka]
   * @return salaryClassID
  **/
  @ApiModelProperty(example = "null", value = "Tarifní třída; ID objektu Tarifní třída [persistentní položka]")
  public String getSalaryClassID() {
    return salaryClassID;
  }

  public void setSalaryClassID(String salaryClassID) {
    this.salaryClassID = salaryClassID;
  }

  public Plmreqcostingroutine totalTime(Double totalTime) {
    this.totalTime = totalTime;
    return this;
  }

   /**
   * Celkový čas v sekundách [persistentní položka]
   * @return totalTime
  **/
  @ApiModelProperty(example = "null", value = "Celkový čas v sekundách [persistentní položka]")
  public Double getTotalTime() {
    return totalTime;
  }

  public void setTotalTime(Double totalTime) {
    this.totalTime = totalTime;
  }

  public Plmreqcostingroutine salary(Double salary) {
    this.salary = salary;
    return this;
  }

   /**
   * Mzda [persistentní položka]
   * @return salary
  **/
  @ApiModelProperty(example = "null", value = "Mzda [persistentní položka]")
  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Plmreqcostingroutine overheadCosts(Double overheadCosts) {
    this.overheadCosts = overheadCosts;
    return this;
  }

   /**
   * Výrobní režie [persistentní položka]
   * @return overheadCosts
  **/
  @ApiModelProperty(example = "null", value = "Výrobní režie [persistentní položka]")
  public Double getOverheadCosts() {
    return overheadCosts;
  }

  public void setOverheadCosts(Double overheadCosts) {
    this.overheadCosts = overheadCosts;
  }

  public Plmreqcostingroutine generalExpense(Double generalExpense) {
    this.generalExpense = generalExpense;
    return this;
  }

   /**
   * Správní režie [persistentní položka]
   * @return generalExpense
  **/
  @ApiModelProperty(example = "null", value = "Správní režie [persistentní položka]")
  public Double getGeneralExpense() {
    return generalExpense;
  }

  public void setGeneralExpense(Double generalExpense) {
    this.generalExpense = generalExpense;
  }

  public Plmreqcostingroutine totalOverheads(Double totalOverheads) {
    this.totalOverheads = totalOverheads;
    return this;
  }

   /**
   * Režie celkem
   * @return totalOverheads
  **/
  @ApiModelProperty(example = "null", value = "Režie celkem")
  public Double getTotalOverheads() {
    return totalOverheads;
  }

  public void setTotalOverheads(Double totalOverheads) {
    this.totalOverheads = totalOverheads;
  }

  public Plmreqcostingroutine TAC(Double TAC) {
    this.TAC = TAC;
    return this;
  }

   /**
   * Dávkový čas v sekundách [persistentní položka]
   * @return TAC
  **/
  @ApiModelProperty(example = "null", value = "Dávkový čas v sekundách [persistentní položka]")
  public Double getTAC() {
    return TAC;
  }

  public void setTAC(Double TAC) {
    this.TAC = TAC;
  }

  public Plmreqcostingroutine TBC(Double TBC) {
    this.TBC = TBC;
    return this;
  }

   /**
   * Kusový čas v sekundách [persistentní položka]
   * @return TBC
  **/
  @ApiModelProperty(example = "null", value = "Kusový čas v sekundách [persistentní položka]")
  public Double getTBC() {
    return TBC;
  }

  public void setTBC(Double TBC) {
    this.TBC = TBC;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmreqcostingroutine plmreqcostingroutine = (Plmreqcostingroutine) o;
    return Objects.equals(this.displayName, plmreqcostingroutine.displayName) &&
        Objects.equals(this.ID, plmreqcostingroutine.ID) &&
        Objects.equals(this.classID, plmreqcostingroutine.classID) &&
        Objects.equals(this.objVersion, plmreqcostingroutine.objVersion) &&
        Objects.equals(this.parentID, plmreqcostingroutine.parentID) &&
        Objects.equals(this.posIndex, plmreqcostingroutine.posIndex) &&
        Objects.equals(this.workPlaceID, plmreqcostingroutine.workPlaceID) &&
        Objects.equals(this.phaseID, plmreqcostingroutine.phaseID) &&
        Objects.equals(this.partTime, plmreqcostingroutine.partTime) &&
        Objects.equals(this.setupTime, plmreqcostingroutine.setupTime) &&
        Objects.equals(this.title, plmreqcostingroutine.title) &&
        Objects.equals(this.cooperation, plmreqcostingroutine.cooperation) &&
        Objects.equals(this.salaryClassID, plmreqcostingroutine.salaryClassID) &&
        Objects.equals(this.totalTime, plmreqcostingroutine.totalTime) &&
        Objects.equals(this.salary, plmreqcostingroutine.salary) &&
        Objects.equals(this.overheadCosts, plmreqcostingroutine.overheadCosts) &&
        Objects.equals(this.generalExpense, plmreqcostingroutine.generalExpense) &&
        Objects.equals(this.totalOverheads, plmreqcostingroutine.totalOverheads) &&
        Objects.equals(this.TAC, plmreqcostingroutine.TAC) &&
        Objects.equals(this.TBC, plmreqcostingroutine.TBC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, workPlaceID, phaseID, partTime, setupTime, title, cooperation, salaryClassID, totalTime, salary, overheadCosts, generalExpense, totalOverheads, TAC, TBC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmreqcostingroutine {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    workPlaceID: ").append(toIndentedString(workPlaceID)).append("\n");
    sb.append("    phaseID: ").append(toIndentedString(phaseID)).append("\n");
    sb.append("    partTime: ").append(toIndentedString(partTime)).append("\n");
    sb.append("    setupTime: ").append(toIndentedString(setupTime)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    cooperation: ").append(toIndentedString(cooperation)).append("\n");
    sb.append("    salaryClassID: ").append(toIndentedString(salaryClassID)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    overheadCosts: ").append(toIndentedString(overheadCosts)).append("\n");
    sb.append("    generalExpense: ").append(toIndentedString(generalExpense)).append("\n");
    sb.append("    totalOverheads: ").append(toIndentedString(totalOverheads)).append("\n");
    sb.append("    TAC: ").append(toIndentedString(TAC)).append("\n");
    sb.append("    TBC: ").append(toIndentedString(TBC)).append("\n");
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

