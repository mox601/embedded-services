package ru.yandex.qatools.embed.service;

import ru.yandex.qatools.embed.service.beans.IndexingResult;

import java.util.List;
import java.util.Map;

/**
 * @author Ilya Sadykov
 */
public interface IndexingService extends EmbeddedService {
    List<IndexingResult> search(Class modelClass, String value);

    List<IndexingResult> search(String collectionName, String value);

    void addToIndex(Class modelClass);

    void indexAll();

    void addToIndex(String collectionName);

    void initSettings(Map<String, Object> settings,
                      Map<String, Map<String, Object>> typedFields);

    void initSettings(Map<String, Object> settings, Map<String, Map<String, Object>> typedFields, Runnable callback);

    void updateMappings(Map<String, Map<String, Object>> typedFields, Runnable callback);

    String collectionName(Class modelClass);
}
