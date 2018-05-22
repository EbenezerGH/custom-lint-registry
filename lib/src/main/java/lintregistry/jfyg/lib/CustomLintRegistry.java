package lintregistry.jfyg.lib;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.Issue;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;
public class CustomLintRegistry extends IssueRegistry {

    public CustomLintRegistry() {

    }

    @NotNull
    @Override
    public List<Issue> getIssues() {
        return Collections.singletonList(TextViewMissingBackgroundIssue.ISSUE);
    }
}