package tv.politics.tray.endpoint;

import javax.xml.bind.JAXBElement;
import org.jdom2.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import tv.politics.tray.MemberSearchRequest;
import tv.politics.tray.MemberSearchResponse;
import tv.politics.tray.service.PoliticsUserService;

@Endpoint
public class PoliticsUserEndpoint {

  private static final String NAMESPACE_URI = "tray.politics.tv";

  /*
   * private PoliticsUserService politicsUserService;
   * 
   * @Autowired public PoliticsUserEndpoint(PoliticsUserService p) {
   * 
   * this.politicsUserService = p; }
   */

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MemberSearchRequest")
  @ResponsePayload
  public MemberSearchResponse getMember(@RequestPayload MemberSearchRequest memberSearchRequest) {
    return null;

    // MemberSearchResponse response = new MemberSearchResponse();

    // perform service injection

  }
  
  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createNewMember")
  @ResponsePayload
  public void registerNewMember(@RequestPayload JAXBElement<String> request ) {
    
  
  }

}
