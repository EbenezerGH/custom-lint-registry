package lintregistry.jfyg.lib;

import com.android.annotations.Nullable;
import com.android.tools.lint.detector.api.ResourceXmlDetector;
import com.android.tools.lint.detector.api.TextFormat;
import com.android.tools.lint.detector.api.XmlContext;

import org.w3c.dom.Element;

import java.util.Collection;
import java.util.Collections;

import static lintregistry.jfyg.lib.Const.SCHEMA;
import static lintregistry.jfyg.lib.Const.TEXTVIEW;
import static lintregistry.jfyg.lib.Const.TEXT_BACKGROUND;

public class TextViewStyleDetector extends ResourceXmlDetector {

    @Nullable
    @Override
    public Collection<String> getApplicableElements() {
        return Collections.singletonList(TEXTVIEW);
    }

    @Override
    public void visitElement(XmlContext context, Element element) {
        if (!element.hasAttributeNS(SCHEMA, TEXT_BACKGROUND)) {
            context.report(
                    TextViewMissingBackgroundIssue.ISSUE,
                    context.getLocation(element),
                    TextViewMissingBackgroundIssue.ISSUE.getExplanation(TextFormat.TEXT));
        }
    }
}