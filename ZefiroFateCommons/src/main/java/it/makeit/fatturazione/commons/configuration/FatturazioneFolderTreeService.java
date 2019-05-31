package it.makeit.fatturazione.commons.configuration;

import org.apache.chemistry.opencmis.client.api.Folder;
import org.apache.chemistry.opencmis.client.api.Session;

import it.makeit.alfresco.AlfrescoHelper;

public class FatturazioneFolderTreeService {

	private String folderFatturazione;
	private AziendeConfiguration aziendeConfiguration;
	
	public FatturazioneFolderTreeService(String folderFatturazione, AziendeConfiguration aziendeConfiguration) {
		super();
		this.folderFatturazione = folderFatturazione;
		this.aziendeConfiguration = aziendeConfiguration;
	}


	public void create(Session session) {
		Folder rootFolderFatturazione = AlfrescoHelper.getFolderByPath(session, folderFatturazione);
		
		if(rootFolderFatturazione == null) {
			throw new IllegalArgumentException("La cartella " +  folderFatturazione + " non esiste");
		}
		
		aziendeConfiguration.getAziende().values().forEach(azienda -> {

			Folder folderAzienda = AlfrescoHelper.getFolderByPath(session,  folderFatturazione + "/" + azienda.getAlfrescopath() );
			if(folderAzienda == null) {
				throw new IllegalArgumentException("La cartella " +  azienda.getAlfrescopath() + " non esiste");
				// AlfrescoHelper.createFolder(session, rootFolderFatturazione.getId(), azienda.getAlfrescopath());
			}

			Folder folderFatture = AlfrescoHelper.getFolderByPath(session, folderFatturazione + "/" + azienda.getAlfrescopath() + "/Fatture");
			if(folderFatture == null) {
				AlfrescoHelper.createFolder(session, folderAzienda.getId(), "Fatture");
			}

			Folder folderBanche = AlfrescoHelper.getFolderByPath(session, folderFatturazione +  "/" +  azienda.getAlfrescopath() + "/anagraficaBanca");
			if(folderBanche == null) {
				AlfrescoHelper.createFolder(session, folderAzienda.getId(), "anagraficaBanca");
			}
			
			Folder folderClienti = AlfrescoHelper.getFolderByPath(session, folderFatturazione +  "/" + azienda.getAlfrescopath() + "/anagraficaCliente");
			if(folderClienti == null) {
				AlfrescoHelper.createFolder(session, folderAzienda.getId(), "anagraficaCliente");
			}
			
			Folder folderFornitori = AlfrescoHelper.getFolderByPath(session, folderFatturazione +  "/" + azienda.getAlfrescopath() + "/anagraficaFornitore");
			if(folderFornitori == null) {
				AlfrescoHelper.createFolder(session, folderAzienda.getId(), "anagraficaFornitore");
			}
			
			Folder folderXmlFatture = AlfrescoHelper.getFolderByPath(session, folderFatturazione +  "/" + azienda.getAlfrescopath() + "/XmlFatture");
			if(folderXmlFatture == null) {
				AlfrescoHelper.createFolder(session,folderAzienda.getId(), "XmlFatture");
			}	
			
			Folder folderAllegati = AlfrescoHelper.getFolderByPath(session, folderFatturazione +  "/" + azienda.getAlfrescopath() + "/AllegatiAllaFattura");
			if(folderAllegati == null) {
				AlfrescoHelper.createFolder(session,folderAzienda.getId(), "AllegatiAllaFattura");
			}	
			
			Folder folderPagamenti = AlfrescoHelper.getFolderByPath(session, folderFatturazione +  "/" + azienda.getAlfrescopath() + "/Pagamenti");
			if(folderPagamenti == null) {
				AlfrescoHelper.createFolder(session,folderAzienda.getId(), "Pagamenti");
			}
			
		});
		
	}
}
