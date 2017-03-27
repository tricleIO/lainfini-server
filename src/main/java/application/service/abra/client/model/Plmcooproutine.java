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
 * Plmcooproutine
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Plmcooproutine   {
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

  @SerializedName("JobOrdersRoutine_ID")
  private String jobOrdersRoutineID = null;

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
   * Vlastník; ID objektu Koop. - vyráběná položka [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Koop. - vyráběná položka [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Plmcooproutine jobOrdersRoutineID(String jobOrdersRoutineID) {
    this.jobOrdersRoutineID = jobOrdersRoutineID;
    return this;
  }

   /**
   * Operace; ID objektu VP - technologický postup [persistentní položka]
   * @return jobOrdersRoutineID
  **/
  @ApiModelProperty(example = "null", value = "Operace; ID objektu VP - technologický postup [persistentní položka]")
  public String getJobOrdersRoutineID() {
    return jobOrdersRoutineID;
  }

  public void setJobOrdersRoutineID(String jobOrdersRoutineID) {
    this.jobOrdersRoutineID = jobOrdersRoutineID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmcooproutine plmcooproutine = (Plmcooproutine) o;
    return Objects.equals(this.displayName, plmcooproutine.displayName) &&
        Objects.equals(this.ID, plmcooproutine.ID) &&
        Objects.equals(this.classID, plmcooproutine.classID) &&
        Objects.equals(this.objVersion, plmcooproutine.objVersion) &&
        Objects.equals(this.parentID, plmcooproutine.parentID) &&
        Objects.equals(this.jobOrdersRoutineID, plmcooproutine.jobOrdersRoutineID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, jobOrdersRoutineID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmcooproutine {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    jobOrdersRoutineID: ").append(toIndentedString(jobOrdersRoutineID)).append("\n");
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

