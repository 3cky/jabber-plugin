/**
 * Copyright (c) 2007-2017 the original author or authors
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE
 */
package hudson.plugins.jabber.im.transport;

import hudson.Plugin;
import hudson.plugins.im.IMPlugin;

/**
 * Plugin entry point used to start/stop the plugin.
 *
 * @author Uwe Schaefer
 * @author kutzi
 */
public class JabberPluginImpl extends Plugin {

	private transient final IMPlugin imPlugin;

	public JabberPluginImpl() {
		this.imPlugin = new IMPlugin(JabberIMConnectionProvider.getInstance());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void start() throws Exception {
		super.start();
		this.imPlugin.start();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void stop() throws Exception {
		this.imPlugin.stop();
		super.stop();
	}
}
