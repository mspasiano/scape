/**
 * 
 */
package eu.scape_project.pit.invoke;

import java.io.File;
import java.io.IOException;

import eu.scape_project.pit.tools.Action;
import eu.scape_project.pit.tools.ToolSpec;

/**
 * @author Andrew Jackson <Andrew.Jackson@bl.uk>
 *
 */
public class Convert extends Processor {

	/**
	 * @param ts
	 * @param action
	 */
	public Convert(ToolSpec ts, Action action) {
		super(ts, action);
	}

	/**
	 * @param input
	 * @param output
	 * @throws CommandNotFoundException
	 * @throws IOException
	 */
	public void convert( File input, File output) throws CommandNotFoundException, IOException {
		this.execute(new In(input), new Out(output), null );
	}
	
}