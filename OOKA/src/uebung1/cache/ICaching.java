package uebung1.cache;

import java.util.HashMap;
import java.util.List;

public interface ICaching<T> {
	public void cacheResult(String key, List<T> values);
	public HashMap<String, List<T>> getCache();
	public List<T> getValueFromKey(String key);
	public void clearCache();
	public void deleteValueFromKey(String key);
}
