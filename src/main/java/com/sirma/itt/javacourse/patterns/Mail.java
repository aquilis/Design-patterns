package com.sirma.itt.javacourse.patterns;

import java.util.List;

/**
 * A sample class representing an attachment to the mail.
 */
class Attachment {
	/*
	 * functionality not implemented.
	 */
}

/**
 * A class representing an e-mail message, using the fluent approach.
 */
@SuppressWarnings("unused")
public class Mail {

	private String from;
	private String to;
	private String subject;
	private String content;
	private String[] cc;
	private List<Attachment> attachments;

	/**
	 * a nullary constrctor.
	 */
	public Mail() {
	}

	/**
	 * A setter for the from field.
	 * 
	 * @param from
	 *            is mail sender.
	 * @return a reference to the current instance of the mail
	 */
	public Mail setFrom(String from) {
		this.from = from;
		return this;
	}

	/**
	 * A setter for the To field.
	 * 
	 * @param to
	 *            is the recepient of the mail
	 * @return a reference to the current mail instance
	 */
	public Mail setTo(String to) {
		this.to = to;
		return this;
	}

	/**
	 * A setter for the subject of the mail.
	 * 
	 * @param subject
	 *            is the titile/subject of the mail
	 * @return a reference to the current mail instance
	 */
	public Mail setSubject(String subject) {
		this.subject = subject;
		return this;
	}

	/**
	 * A setter for the mail content.
	 * 
	 * @param content
	 *            is the content of the mail.
	 * @return a reference to the current mail instance
	 */
	public Mail setContent(String content) {
		this.content = content;
		return this;
	}

	/**
	 * A setter for the CC.
	 * 
	 * @param cc
	 *            is the carbon copy to set - an array of emails.
	 * @return a reference to the current email instance
	 */
	public Mail setCc(String[] cc) {
		this.cc = cc;
		return this;
	}

	/**
	 * A setter for the mail attachments.
	 * 
	 * @param attachments
	 *            is the list of attachemts to be attached to the email.
	 * @return a reference to the current mail instance
	 */
	public Mail setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
		return this;
	}

	/**
	 * Test the fluent.
	 * 
	 * @param args
	 *            are the cmd arsg.
	 */
	public static void main(String[] args) {
		Mail mail = new Mail().setFrom("John@mail.com")
				.setTo("Mitio_Pishtova@mail.com")
				.setContent("wassup, dawg")
				.setSubject("wazzup");
	}
}
