/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.demos.bean;

/**
 * @author  Neil Griffin
 */
public class ApplicantViewBean {

	// JavaBeans Properties for UI
	private boolean commentsRendered = false;
	private boolean fileUploaderRendered = false;

	public void setCommentsRendered(boolean commentsRendered) {
		this.commentsRendered = commentsRendered;
	}

	public boolean isCommentsRendered() {
		return commentsRendered;
	}

	public boolean isFileUploaderRendered() {
		return fileUploaderRendered;
	}

	public void setFileUploaderRendered(boolean fileUploaderRendered) {
		this.fileUploaderRendered = fileUploaderRendered;
	}

}