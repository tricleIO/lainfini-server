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
 * Pdmclosing
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Pdmclosing   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("period_id")
  private String periodId = null;

  @SerializedName("ordnumber")
  private Integer ordnumber = null;

  @SerializedName("docdate$date")
  private DateTime docdatedate = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("newrelatedtype")
  private Integer newrelatedtype = null;

  @SerializedName("newrelateddocument_id")
  private String newrelateddocumentId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("postdate$date")
  private DateTime postdatedate = null;

  @SerializedName("externalnumber")
  private String externalnumber = null;

  @SerializedName("postprovider_id")
  private String postproviderId = null;

  public Pdmclosing displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * Číslo dok.
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "Číslo dok.")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Pdmclosing id(String id) {
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

  public Pdmclosing classid(String classid) {
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

  public Pdmclosing objversion(Integer objversion) {
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

  public Pdmclosing docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * zdrojová řada; id objektu Řada dokladů [persistentní položka]
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "zdrojová řada; id objektu Řada dokladů [persistentní položka]")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Pdmclosing periodId(String periodId) {
    this.periodId = periodId;
    return this;
  }

   /**
   * období; id objektu období [persistentní položka]
   * @return periodId
  **/
  @ApiModelProperty(example = "null", value = "období; id objektu období [persistentní položka]")
  public String getPeriodId() {
    return periodId;
  }

  public void setPeriodId(String periodId) {
    this.periodId = periodId;
  }

  public Pdmclosing ordnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
    return this;
  }

   /**
   * pořadové číslo [persistentní položka]
   * @return ordnumber
  **/
  @ApiModelProperty(example = "null", value = "pořadové číslo [persistentní položka]")
  public Integer getOrdnumber() {
    return ordnumber;
  }

  public void setOrdnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
  }

  public Pdmclosing docdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
    return this;
  }

   /**
   * datum dok. [persistentní položka]
   * @return docdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum dok. [persistentní položka]")
  public DateTime getDocdatedate() {
    return docdatedate;
  }

  public void setDocdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
  }

  public Pdmclosing createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * vytvořil; id objektu uživatel [persistentní položka]
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "vytvořil; id objektu uživatel [persistentní položka]")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Pdmclosing correctedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
    return this;
  }

   /**
   * opravil; id objektu uživatel [persistentní položka]
   * @return correctedbyId
  **/
  @ApiModelProperty(example = "null", value = "opravil; id objektu uživatel [persistentní položka]")
  public String getCorrectedbyId() {
    return correctedbyId;
  }

  public void setCorrectedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
  }

  public Pdmclosing newrelatedtype(Integer newrelatedtype) {
    this.newrelatedtype = newrelatedtype;
    return this;
  }

   /**
   * typ relace
   * @return newrelatedtype
  **/
  @ApiModelProperty(example = "null", value = "typ relace")
  public Integer getNewrelatedtype() {
    return newrelatedtype;
  }

  public void setNewrelatedtype(Integer newrelatedtype) {
    this.newrelatedtype = newrelatedtype;
  }

  public Pdmclosing newrelateddocumentId(String newrelateddocumentId) {
    this.newrelateddocumentId = newrelateddocumentId;
    return this;
  }

   /**
   * id dokladu pro připojení
   * @return newrelateddocumentId
  **/
  @ApiModelProperty(example = "null", value = "id dokladu pro připojení")
  public String getNewrelateddocumentId() {
    return newrelateddocumentId;
  }

  public void setNewrelateddocumentId(String newrelateddocumentId) {
    this.newrelateddocumentId = newrelateddocumentId;
  }

  public Pdmclosing description(String description) {
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

  public Pdmclosing postdatedate(DateTime postdatedate) {
    this.postdatedate = postdatedate;
    return this;
  }

   /**
   * datum a čas odeslání [persistentní položka]
   * @return postdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum a čas odeslání [persistentní položka]")
  public DateTime getPostdatedate() {
    return postdatedate;
  }

  public void setPostdatedate(DateTime postdatedate) {
    this.postdatedate = postdatedate;
  }

  public Pdmclosing externalnumber(String externalnumber) {
    this.externalnumber = externalnumber;
    return this;
  }

   /**
   * externí číslo [persistentní položka]
   * @return externalnumber
  **/
  @ApiModelProperty(example = "null", value = "externí číslo [persistentní položka]")
  public String getExternalnumber() {
    return externalnumber;
  }

  public void setExternalnumber(String externalnumber) {
    this.externalnumber = externalnumber;
  }

  public Pdmclosing postproviderId(String postproviderId) {
    this.postproviderId = postproviderId;
    return this;
  }

   /**
   * poštovní poskytovatel; id objektu poskytovatel poštovních služeb [persistentní položka]
   * @return postproviderId
  **/
  @ApiModelProperty(example = "null", value = "poštovní poskytovatel; id objektu poskytovatel poštovních služeb [persistentní položka]")
  public String getPostproviderId() {
    return postproviderId;
  }

  public void setPostproviderId(String postproviderId) {
    this.postproviderId = postproviderId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pdmclosing pdmclosing = (Pdmclosing) o;
    return Objects.equals(this.displayname, pdmclosing.displayname) &&
        Objects.equals(this.id, pdmclosing.id) &&
        Objects.equals(this.classid, pdmclosing.classid) &&
        Objects.equals(this.objversion, pdmclosing.objversion) &&
        Objects.equals(this.docqueueId, pdmclosing.docqueueId) &&
        Objects.equals(this.periodId, pdmclosing.periodId) &&
        Objects.equals(this.ordnumber, pdmclosing.ordnumber) &&
        Objects.equals(this.docdatedate, pdmclosing.docdatedate) &&
        Objects.equals(this.createdbyId, pdmclosing.createdbyId) &&
        Objects.equals(this.correctedbyId, pdmclosing.correctedbyId) &&
        Objects.equals(this.newrelatedtype, pdmclosing.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, pdmclosing.newrelateddocumentId) &&
        Objects.equals(this.description, pdmclosing.description) &&
        Objects.equals(this.postdatedate, pdmclosing.postdatedate) &&
        Objects.equals(this.externalnumber, pdmclosing.externalnumber) &&
        Objects.equals(this.postproviderId, pdmclosing.postproviderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, newrelatedtype, newrelateddocumentId, description, postdatedate, externalnumber, postproviderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pdmclosing {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    ordnumber: ").append(toIndentedString(ordnumber)).append("\n");
    sb.append("    docdatedate: ").append(toIndentedString(docdatedate)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    newrelatedtype: ").append(toIndentedString(newrelatedtype)).append("\n");
    sb.append("    newrelateddocumentId: ").append(toIndentedString(newrelateddocumentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    postdatedate: ").append(toIndentedString(postdatedate)).append("\n");
    sb.append("    externalnumber: ").append(toIndentedString(externalnumber)).append("\n");
    sb.append("    postproviderId: ").append(toIndentedString(postproviderId)).append("\n");
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
