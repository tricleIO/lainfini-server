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
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * Busordercheckpoint
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Busordercheckpoint   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("pointdate$date")
  private DateTime pointdatedate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("responsiblesupplierrole_id")
  private String responsiblesupplierroleId = null;

  @SerializedName("responsiblecustomerperson_id")
  private String responsiblecustomerpersonId = null;

  @SerializedName("checkdescription")
  private String checkdescription = null;

  @SerializedName("plannedcosts")
  private Double plannedcosts = null;

  @SerializedName("plannedrevenues")
  private Double plannedrevenues = null;

  @SerializedName("plannedinvoicing")
  private Double plannedinvoicing = null;

  @SerializedName("checkdone")
  private Boolean checkdone = null;

  @SerializedName("checkresult")
  private String checkresult = null;

  @SerializedName("docalculatebilance")
  private Boolean docalculatebilance = null;

  public Busordercheckpoint displayname(String displayname) {
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

  public Busordercheckpoint id(String id) {
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

  public Busordercheckpoint classid(String classid) {
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

  public Busordercheckpoint objversion(Integer objversion) {
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

  public Busordercheckpoint parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu zakázka [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu zakázka [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Busordercheckpoint pointdatedate(DateTime pointdatedate) {
    this.pointdatedate = pointdatedate;
    return this;
  }

   /**
   * kontrolní bod [persistentní položka]
   * @return pointdatedate
  **/
  @ApiModelProperty(example = "null", value = "kontrolní bod [persistentní položka]")
  public DateTime getPointdatedate() {
    return pointdatedate;
  }

  public void setPointdatedate(DateTime pointdatedate) {
    this.pointdatedate = pointdatedate;
  }

  public Busordercheckpoint name(String name) {
    this.name = name;
    return this;
  }

   /**
   * název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Busordercheckpoint responsiblesupplierroleId(String responsiblesupplierroleId) {
    this.responsiblesupplierroleId = responsiblesupplierroleId;
    return this;
  }

   /**
   * za dodavatele; id objektu role [persistentní položka]
   * @return responsiblesupplierroleId
  **/
  @ApiModelProperty(example = "null", value = "za dodavatele; id objektu role [persistentní položka]")
  public String getResponsiblesupplierroleId() {
    return responsiblesupplierroleId;
  }

  public void setResponsiblesupplierroleId(String responsiblesupplierroleId) {
    this.responsiblesupplierroleId = responsiblesupplierroleId;
  }

  public Busordercheckpoint responsiblecustomerpersonId(String responsiblecustomerpersonId) {
    this.responsiblecustomerpersonId = responsiblecustomerpersonId;
    return this;
  }

   /**
   * za zákazníka; id objektu osoba [persistentní položka]
   * @return responsiblecustomerpersonId
  **/
  @ApiModelProperty(example = "null", value = "za zákazníka; id objektu osoba [persistentní položka]")
  public String getResponsiblecustomerpersonId() {
    return responsiblecustomerpersonId;
  }

  public void setResponsiblecustomerpersonId(String responsiblecustomerpersonId) {
    this.responsiblecustomerpersonId = responsiblecustomerpersonId;
  }

  public Busordercheckpoint checkdescription(String checkdescription) {
    this.checkdescription = checkdescription;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return checkdescription
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getCheckdescription() {
    return checkdescription;
  }

  public void setCheckdescription(String checkdescription) {
    this.checkdescription = checkdescription;
  }

  public Busordercheckpoint plannedcosts(Double plannedcosts) {
    this.plannedcosts = plannedcosts;
    return this;
  }

   /**
   * plánované náklady [persistentní položka]
   * @return plannedcosts
  **/
  @ApiModelProperty(example = "null", value = "plánované náklady [persistentní položka]")
  public Double getPlannedcosts() {
    return plannedcosts;
  }

  public void setPlannedcosts(Double plannedcosts) {
    this.plannedcosts = plannedcosts;
  }

  public Busordercheckpoint plannedrevenues(Double plannedrevenues) {
    this.plannedrevenues = plannedrevenues;
    return this;
  }

   /**
   * plánované výnosy [persistentní položka]
   * @return plannedrevenues
  **/
  @ApiModelProperty(example = "null", value = "plánované výnosy [persistentní položka]")
  public Double getPlannedrevenues() {
    return plannedrevenues;
  }

  public void setPlannedrevenues(Double plannedrevenues) {
    this.plannedrevenues = plannedrevenues;
  }

  public Busordercheckpoint plannedinvoicing(Double plannedinvoicing) {
    this.plannedinvoicing = plannedinvoicing;
    return this;
  }

   /**
   * plánovaná fakturace [persistentní položka]
   * @return plannedinvoicing
  **/
  @ApiModelProperty(example = "null", value = "plánovaná fakturace [persistentní položka]")
  public Double getPlannedinvoicing() {
    return plannedinvoicing;
  }

  public void setPlannedinvoicing(Double plannedinvoicing) {
    this.plannedinvoicing = plannedinvoicing;
  }

  public Busordercheckpoint checkdone(Boolean checkdone) {
    this.checkdone = checkdone;
    return this;
  }

   /**
   * zkontrolováno [persistentní položka]
   * @return checkdone
  **/
  @ApiModelProperty(example = "null", value = "zkontrolováno [persistentní položka]")
  public Boolean getCheckdone() {
    return checkdone;
  }

  public void setCheckdone(Boolean checkdone) {
    this.checkdone = checkdone;
  }

  public Busordercheckpoint checkresult(String checkresult) {
    this.checkresult = checkresult;
    return this;
  }

   /**
   * výsledky kontrol [persistentní položka]
   * @return checkresult
  **/
  @ApiModelProperty(example = "null", value = "výsledky kontrol [persistentní položka]")
  public String getCheckresult() {
    return checkresult;
  }

  public void setCheckresult(String checkresult) {
    this.checkresult = checkresult;
  }

  public Busordercheckpoint docalculatebilance(Boolean docalculatebilance) {
    this.docalculatebilance = docalculatebilance;
    return this;
  }

   /**
   * spočítat bilanci
   * @return docalculatebilance
  **/
  @ApiModelProperty(example = "null", value = "spočítat bilanci")
  public Boolean getDocalculatebilance() {
    return docalculatebilance;
  }

  public void setDocalculatebilance(Boolean docalculatebilance) {
    this.docalculatebilance = docalculatebilance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Busordercheckpoint busordercheckpoint = (Busordercheckpoint) o;
    return Objects.equals(this.displayname, busordercheckpoint.displayname) &&
        Objects.equals(this.id, busordercheckpoint.id) &&
        Objects.equals(this.classid, busordercheckpoint.classid) &&
        Objects.equals(this.objversion, busordercheckpoint.objversion) &&
        Objects.equals(this.parentId, busordercheckpoint.parentId) &&
        Objects.equals(this.pointdatedate, busordercheckpoint.pointdatedate) &&
        Objects.equals(this.name, busordercheckpoint.name) &&
        Objects.equals(this.responsiblesupplierroleId, busordercheckpoint.responsiblesupplierroleId) &&
        Objects.equals(this.responsiblecustomerpersonId, busordercheckpoint.responsiblecustomerpersonId) &&
        Objects.equals(this.checkdescription, busordercheckpoint.checkdescription) &&
        Objects.equals(this.plannedcosts, busordercheckpoint.plannedcosts) &&
        Objects.equals(this.plannedrevenues, busordercheckpoint.plannedrevenues) &&
        Objects.equals(this.plannedinvoicing, busordercheckpoint.plannedinvoicing) &&
        Objects.equals(this.checkdone, busordercheckpoint.checkdone) &&
        Objects.equals(this.checkresult, busordercheckpoint.checkresult) &&
        Objects.equals(this.docalculatebilance, busordercheckpoint.docalculatebilance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, pointdatedate, name, responsiblesupplierroleId, responsiblecustomerpersonId, checkdescription, plannedcosts, plannedrevenues, plannedinvoicing, checkdone, checkresult, docalculatebilance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Busordercheckpoint {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    pointdatedate: ").append(toIndentedString(pointdatedate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    responsiblesupplierroleId: ").append(toIndentedString(responsiblesupplierroleId)).append("\n");
    sb.append("    responsiblecustomerpersonId: ").append(toIndentedString(responsiblecustomerpersonId)).append("\n");
    sb.append("    checkdescription: ").append(toIndentedString(checkdescription)).append("\n");
    sb.append("    plannedcosts: ").append(toIndentedString(plannedcosts)).append("\n");
    sb.append("    plannedrevenues: ").append(toIndentedString(plannedrevenues)).append("\n");
    sb.append("    plannedinvoicing: ").append(toIndentedString(plannedinvoicing)).append("\n");
    sb.append("    checkdone: ").append(toIndentedString(checkdone)).append("\n");
    sb.append("    checkresult: ").append(toIndentedString(checkresult)).append("\n");
    sb.append("    docalculatebilance: ").append(toIndentedString(docalculatebilance)).append("\n");
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

