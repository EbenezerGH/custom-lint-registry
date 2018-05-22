package lintregistry.jfyg.lib;


import com.android.tools.lint.detector.api.Category;
import com.android.tools.lint.detector.api.Implementation;
import com.android.tools.lint.detector.api.Issue;
import com.android.tools.lint.detector.api.Scope;
import com.android.tools.lint.detector.api.Severity;

import static lintregistry.jfyg.lib.Const.BRIEF_DESCRIPTION;
import static lintregistry.jfyg.lib.Const.ID;
import static lintregistry.jfyg.lib.Const.EXPLANATION;
import static lintregistry.jfyg.lib.Const.PRIORITY;

public class TextViewMissingBackgroundIssue {
    public static final Issue ISSUE = Issue.create(
            ID,
            BRIEF_DESCRIPTION,
            EXPLANATION,
            Category.I18N,
            PRIORITY,
            Severity.WARNING,
            new Implementation(TextViewStyleDetector.class, Scope.RESOURCE_FILE_SCOPE)
    );
}