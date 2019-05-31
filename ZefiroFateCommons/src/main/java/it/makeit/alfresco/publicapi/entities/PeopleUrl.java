package it.makeit.alfresco.publicapi.entities;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import com.google.api.client.http.GenericUrl;

import it.makeit.alfresco.restApi.AlfrescoApiPath;
import it.makeit.alfresco.restApi.AlfrescoBaseUrl;
import it.makeit.alfresco.restApi.AlfrescoRESTQueryParamsEnum;
import it.makeit.alfresco.restApi.AlfrescoUrlException;

/**
 * @modified from Alba Quarto, added implementation and methods overrides
 */
public class PeopleUrl extends GenericUrl implements AlfrescoBaseUrl {

	private static final String PATH = "/people";
	private Set<String> params;
	private String pathParam;

	public PeopleUrl(URL pHostUrl) {
		super(pHostUrl);
		populateParams();
		this.appendRawPath(AlfrescoApiPath.ALFRESCO.getPath());
		this.appendRawPath(PATH);
	}

	private void populateParams() {
		if (params == null) {
			params = new HashSet<String>();
		}
		addParam(AlfrescoRESTQueryParamsEnum.FIELDS, AlfrescoRESTQueryParamsEnum.SKIP_COUNT,
				AlfrescoRESTQueryParamsEnum.MAX_ITEMS, AlfrescoRESTQueryParamsEnum.ORDER_BY,
				AlfrescoRESTQueryParamsEnum.TERM);
	}

	private void addParam(AlfrescoRESTQueryParamsEnum... params) {
		if (params == null) {
			return;
		}
		for (AlfrescoRESTQueryParamsEnum param : params) {
			this.params.add(param.getName());
		}
	}

	/**
	 * @author Alba Quarto
	 */
	@Override
	public URL getCompletePath() {
		return this.toURL();
	}

	/**
	 * @author Alba Quarto
	 */
	@Override
	public String getSpecificPath() {
		GenericUrl url = new GenericUrl();
		url.appendRawPath(PATH);
		if (pathParam != null) {
			url.getPathParts().add(pathParam);
		}
		return url.getRawPath();
	}

	/**
	 * @deprecated Using addStringPathParam
	 * @param userId
	 */
	@Deprecated
	public void setUserId(String userId) {
		this.getPathParts().add(userId);
	}

	/**
	 * @author Alba Quarto
	 * @throws AlfrescoUrlException
	 *             if a path parm has already been added or pathParam is null
	 */
	@Override
	public void addStringPathParam(String pathParam) {
		if (pathParam == null) {
			throw new AlfrescoUrlException(AlfrescoUrlException.PATH_PARAM);
		}
		if (this.pathParam != null) {
			throw new AlfrescoUrlException(AlfrescoUrlException.PATH_PARAM);
		}
		this.pathParam = pathParam;
		this.getPathParts().add(pathParam);
	}

	/**
	 * @author Alba Quarto
	 * @throw AlfrescoUrlException always
	 */
	@Override
	public void addIntPathParam(int pathPart) {
		throw new AlfrescoUrlException(AlfrescoUrlException.METHOD);
	}

	@Override
	public Set<String> getQueryParamNames() {
		return params;
	}

	// TODO (Alessio): definire i possibili parametri (@Key)
}
