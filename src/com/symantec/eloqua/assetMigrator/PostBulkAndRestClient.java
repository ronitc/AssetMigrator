package com.symantec.eloqua.assetMigrator;

import com.sun.xml.internal.rngom.util.Uri;
import com.symantec.eloqua.assetMigrator.Campaign.CampaignClient;
import com.symantec.eloqua.assetMigrator.Contact.ContactFieldClient;
import com.symantec.eloqua.assetMigrator.CustomDataObject.GetCdoClient;
import com.symantec.eloqua.assetMigrator.Email.EmailClient;
import com.symantec.eloqua.assetMigrator.Email.DynamicContent.DynamicContentClient;
import com.symantec.eloqua.assetMigrator.Email.FieldMerges.FieldMergeClient;
import com.symantec.eloqua.assetMigrator.Email.Folder.FolderClient;
import com.symantec.eloqua.assetMigrator.Email.Images.ImageClient;
import com.symantec.eloqua.assetMigrator.Form.FormClient;
import com.symantec.eloqua.assetMigrator.LandingPage.LandingPageClient;
import com.symantec.eloqua.assetMigrator.emailFolder.GetEmailFolder;
import com.symantec.eloqua.assetMigrator.emailGroup.GetEmailGroup;
import com.symantec.eloqua.assetMigrator.user.GetUser;

public class PostBulkAndRestClient extends Client {

	public PostBulkAndRestClient(String site, String user, String password, String url) {
		super(site, user, password, url);
		// TODO Auto-generated constructor stub
	}

	private DynamicContentClient _dynamicContentClient;

	public DynamicContentClient DynamicContentClient() {
		if (_dynamicContentClient == null)
			_dynamicContentClient = new DynamicContentClient(this);
		return _dynamicContentClient;

	}

	private FieldMergeClient _fieldMergeClient;

	public FieldMergeClient FieldMergeClient() {
		if (_fieldMergeClient == null)
			_fieldMergeClient = new FieldMergeClient(this);
		return _fieldMergeClient;

	}

	private EmailClient _emailClient;

	public EmailClient EmailClient() {
		if (_emailClient == null)
			_emailClient = new EmailClient(this);
		return _emailClient;
	}

	private ContactFieldClient _contactFieldClient;

	public ContactFieldClient ContactFieldClient() {
		if (_contactFieldClient == null)
			_contactFieldClient = new ContactFieldClient(this);

		return _contactFieldClient;

	}

	private GetUser _getuser;

	public GetUser GetUser() {
		if (_getuser == null)
			_getuser = new GetUser(this);
		return _getuser;
	}

	private FolderClient _folderClient;

	public FolderClient FolderClient() {
		if (_folderClient == null)
			_folderClient = new FolderClient(this);
		return _folderClient;
	}

	private ImageClient _imageClient;

	public ImageClient ImageClient() {
		// TODO Auto-generated method stub
		if (_imageClient == null)
			_imageClient = new ImageClient(this);
		return _imageClient;
	}

	private LandingPageClient _landingPageClient;

	public LandingPageClient LandingPageClient() {
		// TODO Auto-generated method stub
		if (_landingPageClient == null) {
			_landingPageClient = new LandingPageClient(this);
		}

		return _landingPageClient;
	}

	private CampaignClient _campaignClient;

	public CampaignClient CampaignClient() {
		if (_campaignClient == null) {
			_campaignClient = new CampaignClient(this);
		}
		return _campaignClient;
	}

	private FormClient _formClient;

	public FormClient FormClient() {
		// TODO Auto-generated method stub
		if (_formClient == null) {
			_formClient = new FormClient(this);
		}
		return _formClient;
	}

	public byte[] DownlaodData(Uri uri) {
		// TODO Auto-generated method stub
		return null;
	}

	private GetEmailFolder _getEmailFolder;

	public GetEmailFolder GetEmailFolder() {
		// TODO Auto-generated method stub
		if (_getEmailFolder == null) {
			_getEmailFolder = new GetEmailFolder(this);
		}

		return _getEmailFolder;
	}

	private GetEmailGroup _getEmailGroup;

	public GetEmailGroup GetEmailGroup() {
		// TODO Auto-generated method stub
		if (_getEmailGroup == null) {

			_getEmailGroup = new GetEmailGroup(this);
		}
		return _getEmailGroup;
	}

	private GetCdoClient _getCdoClient;

	public GetCdoClient GetCdoClient() {
		if (_getCdoClient == null)
			_getCdoClient = new GetCdoClient(this);

		return _getCdoClient;

	}
}
