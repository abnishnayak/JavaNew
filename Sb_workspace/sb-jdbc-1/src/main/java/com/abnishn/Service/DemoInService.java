package com.abnishn.Service;

import java.util.List;
import com.abnishn.entity.Demo;

public interface DemoInService {
	List<Demo> getDemo();
	void addDemo(Demo demo);
}
