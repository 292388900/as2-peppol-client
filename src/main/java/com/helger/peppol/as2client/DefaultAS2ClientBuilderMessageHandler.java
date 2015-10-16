/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.peppol.as2client;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Default implementation of {@link IAS2ClientBuilderMessageHandler}. Warning
 * messages are logged via an SLF4J logger, error messages will be thrown as
 * {@link AS2ClientBuilderException}.
 *
 * @author Philip Helger
 */
public class DefaultAS2ClientBuilderMessageHandler implements IAS2ClientBuilderMessageHandler
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (DefaultAS2ClientBuilderMessageHandler.class);

  public void warn (@Nonnull final String sMessage)
  {
    s_aLogger.warn (sMessage);
  }

  public void error (@Nonnull final String sMessage) throws AS2ClientBuilderException
  {
    error (sMessage, null);
  }

  public void error (@Nonnull final String sMessage, @Nullable final Throwable aCause) throws AS2ClientBuilderException
  {
    throw new AS2ClientBuilderException (sMessage, aCause);
  }
}