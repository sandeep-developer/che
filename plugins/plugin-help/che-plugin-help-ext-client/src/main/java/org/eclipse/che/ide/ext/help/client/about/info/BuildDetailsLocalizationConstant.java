/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.ext.help.client.about.info;

import com.google.gwt.i18n.client.Messages;

/**
 * Localization constants for `Show Build Details` dialog.
 *
 * @author Vlad Zhukovskyi
 * @since 6.7.0
 */
public interface BuildDetailsLocalizationConstant extends Messages {
  @Key("title")
  String title();

  @Key("copy.to.clipboard.button")
  String copyToClipboardButton();
}
