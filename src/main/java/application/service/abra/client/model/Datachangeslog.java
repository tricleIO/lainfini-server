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
 * Datachangeslog
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Datachangeslog   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("site")
  private String site = null;

  @SerializedName("clientcreatedat$date")
  private DateTime clientcreatedatdate = null;

  @SerializedName("servercreatedat$date")
  private DateTime servercreatedatdate = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("clsid")
  private String clsid = null;

  @SerializedName("obj_id")
  private String objId = null;

  @SerializedName("logdata")
  private byte[] logdata = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("objectname")
  private String objectname = null;

  @SerializedName("logdataformat")
  private Integer logdataformat = null;

  @SerializedName("clsidtext")
  private String clsidtext = null;

  @SerializedName("networkcardid")
  private String networkcardid = null;

  public Datachangeslog displayname(String displayname) {
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

  public Datachangeslog id(String id) {
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

  public Datachangeslog classid(String classid) {
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

  public Datachangeslog objversion(Integer objversion) {
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

  public Datachangeslog site(String site) {
    this.site = site;
    return this;
  }

   /**
   * hnízdo [persistentní položka]
   * @return site
  **/
  @ApiModelProperty(example = "null", value = "hnízdo [persistentní položka]")
  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public Datachangeslog clientcreatedatdate(DateTime clientcreatedatdate) {
    this.clientcreatedatdate = clientcreatedatdate;
    return this;
  }

   /**
   * klientský čas vzniku [persistentní položka]
   * @return clientcreatedatdate
  **/
  @ApiModelProperty(example = "null", value = "klientský čas vzniku [persistentní položka]")
  public DateTime getClientcreatedatdate() {
    return clientcreatedatdate;
  }

  public void setClientcreatedatdate(DateTime clientcreatedatdate) {
    this.clientcreatedatdate = clientcreatedatdate;
  }

  public Datachangeslog servercreatedatdate(DateTime servercreatedatdate) {
    this.servercreatedatdate = servercreatedatdate;
    return this;
  }

   /**
   * centrální čas vzniku [persistentní položka]
   * @return servercreatedatdate
  **/
  @ApiModelProperty(example = "null", value = "centrální čas vzniku [persistentní položka]")
  public DateTime getServercreatedatdate() {
    return servercreatedatdate;
  }

  public void setServercreatedatdate(DateTime servercreatedatdate) {
    this.servercreatedatdate = servercreatedatdate;
  }

  public Datachangeslog createdbyId(String createdbyId) {
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

  public Datachangeslog clsid(String clsid) {
    this.clsid = clsid;
    return this;
  }

   /**
   * třída [persistentní položka]
   * @return clsid
  **/
  @ApiModelProperty(example = "null", value = "třída [persistentní položka]")
  public String getClsid() {
    return clsid;
  }

  public void setClsid(String clsid) {
    this.clsid = clsid;
  }

  public Datachangeslog objId(String objId) {
    this.objId = objId;
    return this;
  }

   /**
   * id objektu [persistentní položka]
   * @return objId
  **/
  @ApiModelProperty(example = "null", value = "id objektu [persistentní položka]")
  public String getObjId() {
    return objId;
  }

  public void setObjId(String objId) {
    this.objId = objId;
  }

  public Datachangeslog logdata(byte[] logdata) {
    this.logdata = logdata;
    return this;
  }

   /**
   * data logu [persistentní položka]
   * @return logdata
  **/
  @ApiModelProperty(example = "null", value = "data logu [persistentní položka]")
  public byte[] getLogdata() {
    return logdata;
  }

  public void setLogdata(byte[] logdata) {
    this.logdata = logdata;
  }

  public Datachangeslog status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * typ změny [persistentní položka]
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "typ změny [persistentní položka]")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Datachangeslog objectname(String objectname) {
    this.objectname = objectname;
    return this;
  }

   /**
   * název objektu [persistentní položka]
   * @return objectname
  **/
  @ApiModelProperty(example = "null", value = "název objektu [persistentní položka]")
  public String getObjectname() {
    return objectname;
  }

  public void setObjectname(String objectname) {
    this.objectname = objectname;
  }

  public Datachangeslog logdataformat(Integer logdataformat) {
    this.logdataformat = logdataformat;
    return this;
  }

   /**
   * formát dat logu [persistentní položka]
   * @return logdataformat
  **/
  @ApiModelProperty(example = "null", value = "formát dat logu [persistentní položka]")
  public Integer getLogdataformat() {
    return logdataformat;
  }

  public void setLogdataformat(Integer logdataformat) {
    this.logdataformat = logdataformat;
  }

  public Datachangeslog clsidtext(String clsidtext) {
    this.clsidtext = clsidtext;
    return this;
  }

   /**
   * třída (textově)
   * @return clsidtext
  **/
  @ApiModelProperty(example = "null", value = "třída (textově)")
  public String getClsidtext() {
    return clsidtext;
  }

  public void setClsidtext(String clsidtext) {
    this.clsidtext = clsidtext;
  }

  public Datachangeslog networkcardid(String networkcardid) {
    this.networkcardid = networkcardid;
    return this;
  }

   /**
   * id síť. karty [persistentní položka]
   * @return networkcardid
  **/
  @ApiModelProperty(example = "null", value = "id síť. karty [persistentní položka]")
  public String getNetworkcardid() {
    return networkcardid;
  }

  public void setNetworkcardid(String networkcardid) {
    this.networkcardid = networkcardid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Datachangeslog datachangeslog = (Datachangeslog) o;
    return Objects.equals(this.displayname, datachangeslog.displayname) &&
        Objects.equals(this.id, datachangeslog.id) &&
        Objects.equals(this.classid, datachangeslog.classid) &&
        Objects.equals(this.objversion, datachangeslog.objversion) &&
        Objects.equals(this.site, datachangeslog.site) &&
        Objects.equals(this.clientcreatedatdate, datachangeslog.clientcreatedatdate) &&
        Objects.equals(this.servercreatedatdate, datachangeslog.servercreatedatdate) &&
        Objects.equals(this.createdbyId, datachangeslog.createdbyId) &&
        Objects.equals(this.clsid, datachangeslog.clsid) &&
        Objects.equals(this.objId, datachangeslog.objId) &&
        Objects.equals(this.logdata, datachangeslog.logdata) &&
        Objects.equals(this.status, datachangeslog.status) &&
        Objects.equals(this.objectname, datachangeslog.objectname) &&
        Objects.equals(this.logdataformat, datachangeslog.logdataformat) &&
        Objects.equals(this.clsidtext, datachangeslog.clsidtext) &&
        Objects.equals(this.networkcardid, datachangeslog.networkcardid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, site, clientcreatedatdate, servercreatedatdate, createdbyId, clsid, objId, logdata, status, objectname, logdataformat, clsidtext, networkcardid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Datachangeslog {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    clientcreatedatdate: ").append(toIndentedString(clientcreatedatdate)).append("\n");
    sb.append("    servercreatedatdate: ").append(toIndentedString(servercreatedatdate)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    clsid: ").append(toIndentedString(clsid)).append("\n");
    sb.append("    objId: ").append(toIndentedString(objId)).append("\n");
    sb.append("    logdata: ").append(toIndentedString(logdata)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    objectname: ").append(toIndentedString(objectname)).append("\n");
    sb.append("    logdataformat: ").append(toIndentedString(logdataformat)).append("\n");
    sb.append("    clsidtext: ").append(toIndentedString(clsidtext)).append("\n");
    sb.append("    networkcardid: ").append(toIndentedString(networkcardid)).append("\n");
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

