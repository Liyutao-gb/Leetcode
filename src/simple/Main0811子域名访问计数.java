package simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main0811子域名访问计数 {
	public static void main(String[] args) {

		System.out.println(new Solution811().subdomainVisits(
				new String[] { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" }));
	}
}

class Solution811 {
	public List<String> subdomainVisits(String[] cpdomains) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < cpdomains.length; i++) {
			String[] cpd0main = cpdomains[i].split(" ");
			String[] cpd0 = cpd0main[1].split("\\.");// 需要转义，尤其要注意
			String domain = "";
			for (int j = cpd0.length - 1; j >= 0; j--) {
				if (j == cpd0.length - 1) {
					domain += cpd0[j];
				} else {
					domain = cpd0[j] + "." + domain;
				}

				if (map.get(domain) == null) {
					map.put(domain, Integer.parseInt(cpd0main[0]));
				} else {
					map.put(domain, map.get(domain) + Integer.parseInt(cpd0main[0]));
				}
			}
		}
		List<String> list = new ArrayList<>();
		for (String key : map.keySet()) {
			list.add(map.get(key) + " " + key);
		}
		return list;
	}
}