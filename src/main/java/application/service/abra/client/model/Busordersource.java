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

import java.util.Objects;


/**
 * Busordersource
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Busordersource   {
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

  @SerializedName("posindex")
  private Integer posindex = null;

  @SerializedName("sourcerole_id")
  private String sourceroleId = null;

  @SerializedName("sourceorder")
  private Integer sourceorder = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("crmactivityarea_id")
  private String crmactivityareaId = null;

  @SerializedName("crmactivitytype_id")
  private String crmactivitytypeId = null;

  @SerializedName("crmactivityqueue_id")
  private String crmactivityqueueId = null;

  @SerializedName("plannedtotalhours")
  private Double plannedtotalhours = null;

  @SerializedName("realtotalhours")
  private Double realtotalhours = null;

  @SerializedName("canexceedplan")
  private Integer canexceedplan = null;

  @SerializedName("invoicing")
  private Boolean invoicing = null;

  @SerializedName("salepricetype")
  private Integer salepricetype = null;

  @SerializedName("hourrate")
  private Double hourrate = null;

  @SerializedName("overtimehourrate")
  private Double overtimehourrate = null;

  @SerializedName("vatrate_id")
  private String vatrateId = null;

  @SerializedName("costhourrate")
  private Double costhourrate = null;

  @SerializedName("storecard_id")
  private String storecardId = null;

  @SerializedName("storeunit_id")
  private String storeunitId = null;

  @SerializedName("store_id")
  private String storeId = null;

  @SerializedName("pricedefinition1_id")
  private String pricedefinition1Id = null;

  @SerializedName("pricedefinition2_id")
  private String pricedefinition2Id = null;

  @SerializedName("finished")
  private Boolean finished = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  public Busordersource displayname(String displayname) {
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

  public Busordersource id(String id) {
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

  public Busordersource classid(String classid) {
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

  public Busordersource objversion(Integer objversion) {
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

  public Busordersource parentId(String parentId) {
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

  public Busordersource posindex(Integer posindex) {
    this.posindex = posindex;
    return this;
  }

   /**
   * pořadí [persistentní položka]
   * @return posindex
  **/
  @ApiModelProperty(example = "null", value = "pořadí [persistentní položka]")
  public Integer getPosindex() {
    return posindex;
  }

  public void setPosindex(Integer posindex) {
    this.posindex = posindex;
  }

  public Busordersource sourceroleId(String sourceroleId) {
    this.sourceroleId = sourceroleId;
    return this;
  }

   /**
   * role zdroje; id objektu role [persistentní položka]
   * @return sourceroleId
  **/
  @ApiModelProperty(example = "null", value = "role zdroje; id objektu role [persistentní položka]")
  public String getSourceroleId() {
    return sourceroleId;
  }

  public void setSourceroleId(String sourceroleId) {
    this.sourceroleId = sourceroleId;
  }

  public Busordersource sourceorder(Integer sourceorder) {
    this.sourceorder = sourceorder;
    return this;
  }

   /**
   * pořadí [persistentní položka]
   * @return sourceorder
  **/
  @ApiModelProperty(example = "null", value = "pořadí [persistentní položka]")
  public Integer getSourceorder() {
    return sourceorder;
  }

  public void setSourceorder(Integer sourceorder) {
    this.sourceorder = sourceorder;
  }

  public Busordersource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Busordersource crmactivityareaId(String crmactivityareaId) {
    this.crmactivityareaId = crmactivityareaId;
    return this;
  }

   /**
   * oblast aktivity; id objektu oblast aktivity [persistentní položka]
   * @return crmactivityareaId
  **/
  @ApiModelProperty(example = "null", value = "oblast aktivity; id objektu oblast aktivity [persistentní položka]")
  public String getCrmactivityareaId() {
    return crmactivityareaId;
  }

  public void setCrmactivityareaId(String crmactivityareaId) {
    this.crmactivityareaId = crmactivityareaId;
  }

  public Busordersource crmactivitytypeId(String crmactivitytypeId) {
    this.crmactivitytypeId = crmactivitytypeId;
    return this;
  }

   /**
   * typ aktivity; id objektu typ aktivit [persistentní položka]
   * @return crmactivitytypeId
  **/
  @ApiModelProperty(example = "null", value = "typ aktivity; id objektu typ aktivit [persistentní položka]")
  public String getCrmactivitytypeId() {
    return crmactivitytypeId;
  }

  public void setCrmactivitytypeId(String crmactivitytypeId) {
    this.crmactivitytypeId = crmactivitytypeId;
  }

  public Busordersource crmactivityqueueId(String crmactivityqueueId) {
    this.crmactivityqueueId = crmactivityqueueId;
    return this;
  }

   /**
   * Řada akt.; id objektu Řada aktivit [persistentní položka]
   * @return crmactivityqueueId
  **/
  @ApiModelProperty(example = "null", value = "Řada akt.; id objektu Řada aktivit [persistentní položka]")
  public String getCrmactivityqueueId() {
    return crmactivityqueueId;
  }

  public void setCrmactivityqueueId(String crmactivityqueueId) {
    this.crmactivityqueueId = crmactivityqueueId;
  }

  public Busordersource plannedtotalhours(Double plannedtotalhours) {
    this.plannedtotalhours = plannedtotalhours;
    return this;
  }

   /**
   * plánováno [persistentní položka]
   * @return plannedtotalhours
  **/
  @ApiModelProperty(example = "null", value = "plánováno [persistentní položka]")
  public Double getPlannedtotalhours() {
    return plannedtotalhours;
  }

  public void setPlannedtotalhours(Double plannedtotalhours) {
    this.plannedtotalhours = plannedtotalhours;
  }

  public Busordersource realtotalhours(Double realtotalhours) {
    this.realtotalhours = realtotalhours;
    return this;
  }

   /**
   * odpracováno [persistentní položka]
   * @return realtotalhours
  **/
  @ApiModelProperty(example = "null", value = "odpracováno [persistentní položka]")
  public Double getRealtotalhours() {
    return realtotalhours;
  }

  public void setRealtotalhours(Double realtotalhours) {
    this.realtotalhours = realtotalhours;
  }

  public Busordersource canexceedplan(Integer canexceedplan) {
    this.canexceedplan = canexceedplan;
    return this;
  }

   /**
   * povol.přesčas [persistentní položka]
   * @return canexceedplan
  **/
  @ApiModelProperty(example = "null", value = "povol.přesčas [persistentní položka]")
  public Integer getCanexceedplan() {
    return canexceedplan;
  }

  public void setCanexceedplan(Integer canexceedplan) {
    this.canexceedplan = canexceedplan;
  }

  public Busordersource invoicing(Boolean invoicing) {
    this.invoicing = invoicing;
    return this;
  }

   /**
   * fakturovat [persistentní položka]
   * @return invoicing
  **/
  @ApiModelProperty(example = "null", value = "fakturovat [persistentní položka]")
  public Boolean getInvoicing() {
    return invoicing;
  }

  public void setInvoicing(Boolean invoicing) {
    this.invoicing = invoicing;
  }

  public Busordersource salepricetype(Integer salepricetype) {
    this.salepricetype = salepricetype;
    return this;
  }

   /**
   * typ ceny [persistentní položka]
   * @return salepricetype
  **/
  @ApiModelProperty(example = "null", value = "typ ceny [persistentní položka]")
  public Integer getSalepricetype() {
    return salepricetype;
  }

  public void setSalepricetype(Integer salepricetype) {
    this.salepricetype = salepricetype;
  }

  public Busordersource hourrate(Double hourrate) {
    this.hourrate = hourrate;
    return this;
  }

   /**
   * zákl.sazba [persistentní položka]
   * @return hourrate
  **/
  @ApiModelProperty(example = "null", value = "zákl.sazba [persistentní položka]")
  public Double getHourrate() {
    return hourrate;
  }

  public void setHourrate(Double hourrate) {
    this.hourrate = hourrate;
  }

  public Busordersource overtimehourrate(Double overtimehourrate) {
    this.overtimehourrate = overtimehourrate;
    return this;
  }

   /**
   * přesčas.sazba [persistentní položka]
   * @return overtimehourrate
  **/
  @ApiModelProperty(example = "null", value = "přesčas.sazba [persistentní položka]")
  public Double getOvertimehourrate() {
    return overtimehourrate;
  }

  public void setOvertimehourrate(Double overtimehourrate) {
    this.overtimehourrate = overtimehourrate;
  }

  public Busordersource vatrateId(String vatrateId) {
    this.vatrateId = vatrateId;
    return this;
  }

   /**
   * sazba dph; id objektu dph sazba [persistentní položka]
   * @return vatrateId
  **/
  @ApiModelProperty(example = "null", value = "sazba dph; id objektu dph sazba [persistentní položka]")
  public String getVatrateId() {
    return vatrateId;
  }

  public void setVatrateId(String vatrateId) {
    this.vatrateId = vatrateId;
  }

  public Busordersource costhourrate(Double costhourrate) {
    this.costhourrate = costhourrate;
    return this;
  }

   /**
   * náklad.sazba [persistentní položka]
   * @return costhourrate
  **/
  @ApiModelProperty(example = "null", value = "náklad.sazba [persistentní položka]")
  public Double getCosthourrate() {
    return costhourrate;
  }

  public void setCosthourrate(Double costhourrate) {
    this.costhourrate = costhourrate;
  }

  public Busordersource storecardId(String storecardId) {
    this.storecardId = storecardId;
    return this;
  }

   /**
   * skladová karta; id objektu skladová karta [persistentní položka]
   * @return storecardId
  **/
  @ApiModelProperty(example = "null", value = "skladová karta; id objektu skladová karta [persistentní položka]")
  public String getStorecardId() {
    return storecardId;
  }

  public void setStorecardId(String storecardId) {
    this.storecardId = storecardId;
  }

  public Busordersource storeunitId(String storeunitId) {
    this.storeunitId = storeunitId;
    return this;
  }

   /**
   * jednotka; id objektu jednotka skladové karty [persistentní položka]
   * @return storeunitId
  **/
  @ApiModelProperty(example = "null", value = "jednotka; id objektu jednotka skladové karty [persistentní položka]")
  public String getStoreunitId() {
    return storeunitId;
  }

  public void setStoreunitId(String storeunitId) {
    this.storeunitId = storeunitId;
  }

  public Busordersource storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * sklad; id objektu sklad [persistentní položka]
   * @return storeId
  **/
  @ApiModelProperty(example = "null", value = "sklad; id objektu sklad [persistentní položka]")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public Busordersource pricedefinition1Id(String pricedefinition1Id) {
    this.pricedefinition1Id = pricedefinition1Id;
    return this;
  }

   /**
   * def.ceny zákl.; id objektu definice ceny [persistentní položka]
   * @return pricedefinition1Id
  **/
  @ApiModelProperty(example = "null", value = "def.ceny zákl.; id objektu definice ceny [persistentní položka]")
  public String getPricedefinition1Id() {
    return pricedefinition1Id;
  }

  public void setPricedefinition1Id(String pricedefinition1Id) {
    this.pricedefinition1Id = pricedefinition1Id;
  }

  public Busordersource pricedefinition2Id(String pricedefinition2Id) {
    this.pricedefinition2Id = pricedefinition2Id;
    return this;
  }

   /**
   * def.ceny přesč.; id objektu definice ceny [persistentní položka]
   * @return pricedefinition2Id
  **/
  @ApiModelProperty(example = "null", value = "def.ceny přesč.; id objektu definice ceny [persistentní položka]")
  public String getPricedefinition2Id() {
    return pricedefinition2Id;
  }

  public void setPricedefinition2Id(String pricedefinition2Id) {
    this.pricedefinition2Id = pricedefinition2Id;
  }

  public Busordersource finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

   /**
   * dokončeno [persistentní položka]
   * @return finished
  **/
  @ApiModelProperty(example = "null", value = "dokončeno [persistentní položka]")
  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public Busordersource note(String note) {
    this.note = note;
    return this;
  }

   /**
   * poznámka [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "poznámka [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Busordersource divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }

   /**
   * středisko; id objektu středisko [persistentní položka]
   * @return divisionId
  **/
  @ApiModelProperty(example = "null", value = "středisko; id objektu středisko [persistentní položka]")
  public String getDivisionId() {
    return divisionId;
  }

  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  public Busordersource bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * obchodní případ; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "obchodní případ; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Busordersource busprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
    return this;
  }

   /**
   * projekt; id objektu projekt [persistentní položka]
   * @return busprojectId
  **/
  @ApiModelProperty(example = "null", value = "projekt; id objektu projekt [persistentní položka]")
  public String getBusprojectId() {
    return busprojectId;
  }

  public void setBusprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Busordersource busordersource = (Busordersource) o;
    return Objects.equals(this.displayname, busordersource.displayname) &&
        Objects.equals(this.id, busordersource.id) &&
        Objects.equals(this.classid, busordersource.classid) &&
        Objects.equals(this.objversion, busordersource.objversion) &&
        Objects.equals(this.parentId, busordersource.parentId) &&
        Objects.equals(this.posindex, busordersource.posindex) &&
        Objects.equals(this.sourceroleId, busordersource.sourceroleId) &&
        Objects.equals(this.sourceorder, busordersource.sourceorder) &&
        Objects.equals(this.description, busordersource.description) &&
        Objects.equals(this.crmactivityareaId, busordersource.crmactivityareaId) &&
        Objects.equals(this.crmactivitytypeId, busordersource.crmactivitytypeId) &&
        Objects.equals(this.crmactivityqueueId, busordersource.crmactivityqueueId) &&
        Objects.equals(this.plannedtotalhours, busordersource.plannedtotalhours) &&
        Objects.equals(this.realtotalhours, busordersource.realtotalhours) &&
        Objects.equals(this.canexceedplan, busordersource.canexceedplan) &&
        Objects.equals(this.invoicing, busordersource.invoicing) &&
        Objects.equals(this.salepricetype, busordersource.salepricetype) &&
        Objects.equals(this.hourrate, busordersource.hourrate) &&
        Objects.equals(this.overtimehourrate, busordersource.overtimehourrate) &&
        Objects.equals(this.vatrateId, busordersource.vatrateId) &&
        Objects.equals(this.costhourrate, busordersource.costhourrate) &&
        Objects.equals(this.storecardId, busordersource.storecardId) &&
        Objects.equals(this.storeunitId, busordersource.storeunitId) &&
        Objects.equals(this.storeId, busordersource.storeId) &&
        Objects.equals(this.pricedefinition1Id, busordersource.pricedefinition1Id) &&
        Objects.equals(this.pricedefinition2Id, busordersource.pricedefinition2Id) &&
        Objects.equals(this.finished, busordersource.finished) &&
        Objects.equals(this.note, busordersource.note) &&
        Objects.equals(this.divisionId, busordersource.divisionId) &&
        Objects.equals(this.bustransactionId, busordersource.bustransactionId) &&
        Objects.equals(this.busprojectId, busordersource.busprojectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, sourceroleId, sourceorder, description, crmactivityareaId, crmactivitytypeId, crmactivityqueueId, plannedtotalhours, realtotalhours, canexceedplan, invoicing, salepricetype, hourrate, overtimehourrate, vatrateId, costhourrate, storecardId, storeunitId, storeId, pricedefinition1Id, pricedefinition2Id, finished, note, divisionId, bustransactionId, busprojectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Busordersource {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    sourceroleId: ").append(toIndentedString(sourceroleId)).append("\n");
    sb.append("    sourceorder: ").append(toIndentedString(sourceorder)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    crmactivityareaId: ").append(toIndentedString(crmactivityareaId)).append("\n");
    sb.append("    crmactivitytypeId: ").append(toIndentedString(crmactivitytypeId)).append("\n");
    sb.append("    crmactivityqueueId: ").append(toIndentedString(crmactivityqueueId)).append("\n");
    sb.append("    plannedtotalhours: ").append(toIndentedString(plannedtotalhours)).append("\n");
    sb.append("    realtotalhours: ").append(toIndentedString(realtotalhours)).append("\n");
    sb.append("    canexceedplan: ").append(toIndentedString(canexceedplan)).append("\n");
    sb.append("    invoicing: ").append(toIndentedString(invoicing)).append("\n");
    sb.append("    salepricetype: ").append(toIndentedString(salepricetype)).append("\n");
    sb.append("    hourrate: ").append(toIndentedString(hourrate)).append("\n");
    sb.append("    overtimehourrate: ").append(toIndentedString(overtimehourrate)).append("\n");
    sb.append("    vatrateId: ").append(toIndentedString(vatrateId)).append("\n");
    sb.append("    costhourrate: ").append(toIndentedString(costhourrate)).append("\n");
    sb.append("    storecardId: ").append(toIndentedString(storecardId)).append("\n");
    sb.append("    storeunitId: ").append(toIndentedString(storeunitId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    pricedefinition1Id: ").append(toIndentedString(pricedefinition1Id)).append("\n");
    sb.append("    pricedefinition2Id: ").append(toIndentedString(pricedefinition2Id)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
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

