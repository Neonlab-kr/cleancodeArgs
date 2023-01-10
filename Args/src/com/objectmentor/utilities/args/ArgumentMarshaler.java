package com.objectmentor.utilities.args;

import java.util.*;

public interface ArgumentMarshaler {
	void set(Iterator<String> currentArgument) throws ArgsException;
}