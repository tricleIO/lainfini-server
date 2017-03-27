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
 * Filequeuerule
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Filequeuerule   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("PosIndex")
  private Integer posIndex = null;

  @SerializedName("GoOn")
  private Boolean goOn = null;

  @SerializedName("RuleActions")
  private List<Filequeueruleaction> ruleActions = new ArrayList<Filequeueruleaction>();

  @SerializedName("Description")
  private String description = null;

  @SerializedName("FileNameMask")
  private String fileNameMask = null;

  @SerializedName("FileNameMaskIsRegEx")
  private Boolean fileNameMaskIsRegEx = null;

  @SerializedName("FileQueue_ID")
  private String fileQueueID = null;

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

  public Filequeuerule posIndex(Integer posIndex) {
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

  public Filequeuerule goOn(Boolean goOn) {
    this.goOn = goOn;
    return this;
  }

   /**
   * Pokračovat [persistentní položka]
   * @return goOn
  **/
  @ApiModelProperty(example = "null", value = "Pokračovat [persistentní položka]")
  public Boolean getGoOn() {
    return goOn;
  }

  public void setGoOn(Boolean goOn) {
    this.goOn = goOn;
  }

  public Filequeuerule ruleActions(List<Filequeueruleaction> ruleActions) {
    this.ruleActions = ruleActions;
    return this;
  }

  public Filequeuerule addRuleActionsItem(Filequeueruleaction ruleActionsItem) {
    this.ruleActions.add(ruleActionsItem);
    return this;
  }

   /**
   * Akce; kolekce BO Akce pravidla pro zpracování front souborů [nepersistentní položka]
   * @return ruleActions
  **/
  @ApiModelProperty(example = "null", value = "Akce; kolekce BO Akce pravidla pro zpracování front souborů [nepersistentní položka]")
  public List<Filequeueruleaction> getRuleActions() {
    return ruleActions;
  }

  public void setRuleActions(List<Filequeueruleaction> ruleActions) {
    this.ruleActions = ruleActions;
  }

  public Filequeuerule description(String description) {
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

  public Filequeuerule fileNameMask(String fileNameMask) {
    this.fileNameMask = fileNameMask;
    return this;
  }

   /**
   * Maska pro název souboru [persistentní položka]
   * @return fileNameMask
  **/
  @ApiModelProperty(example = "null", value = "Maska pro název souboru [persistentní položka]")
  public String getFileNameMask() {
    return fileNameMask;
  }

  public void setFileNameMask(String fileNameMask) {
    this.fileNameMask = fileNameMask;
  }

  public Filequeuerule fileNameMaskIsRegEx(Boolean fileNameMaskIsRegEx) {
    this.fileNameMaskIsRegEx = fileNameMaskIsRegEx;
    return this;
  }

   /**
   * Maska názvu souborů je regulární výraz [persistentní položka]
   * @return fileNameMaskIsRegEx
  **/
  @ApiModelProperty(example = "null", value = "Maska názvu souborů je regulární výraz [persistentní položka]")
  public Boolean getFileNameMaskIsRegEx() {
    return fileNameMaskIsRegEx;
  }

  public void setFileNameMaskIsRegEx(Boolean fileNameMaskIsRegEx) {
    this.fileNameMaskIsRegEx = fileNameMaskIsRegEx;
  }

  public Filequeuerule fileQueueID(String fileQueueID) {
    this.fileQueueID = fileQueueID;
    return this;
  }

   /**
   * Fronta souborů; ID objektu Fronta souborů [persistentní položka]
   * @return fileQueueID
  **/
  @ApiModelProperty(example = "null", value = "Fronta souborů; ID objektu Fronta souborů [persistentní položka]")
  public String getFileQueueID() {
    return fileQueueID;
  }

  public void setFileQueueID(String fileQueueID) {
    this.fileQueueID = fileQueueID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filequeuerule filequeuerule = (Filequeuerule) o;
    return Objects.equals(this.displayName, filequeuerule.displayName) &&
        Objects.equals(this.ID, filequeuerule.ID) &&
        Objects.equals(this.classID, filequeuerule.classID) &&
        Objects.equals(this.objVersion, filequeuerule.objVersion) &&
        Objects.equals(this.posIndex, filequeuerule.posIndex) &&
        Objects.equals(this.goOn, filequeuerule.goOn) &&
        Objects.equals(this.ruleActions, filequeuerule.ruleActions) &&
        Objects.equals(this.description, filequeuerule.description) &&
        Objects.equals(this.fileNameMask, filequeuerule.fileNameMask) &&
        Objects.equals(this.fileNameMaskIsRegEx, filequeuerule.fileNameMaskIsRegEx) &&
        Objects.equals(this.fileQueueID, filequeuerule.fileQueueID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, posIndex, goOn, ruleActions, description, fileNameMask, fileNameMaskIsRegEx, fileQueueID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filequeuerule {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    goOn: ").append(toIndentedString(goOn)).append("\n");
    sb.append("    ruleActions: ").append(toIndentedString(ruleActions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileNameMask: ").append(toIndentedString(fileNameMask)).append("\n");
    sb.append("    fileNameMaskIsRegEx: ").append(toIndentedString(fileNameMaskIsRegEx)).append("\n");
    sb.append("    fileQueueID: ").append(toIndentedString(fileQueueID)).append("\n");
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

