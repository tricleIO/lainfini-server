package application.util;

import application.persistence.repository.SlugRepository;

public class SlugMaker {

    public static String getSlugFromString(String string, SlugRepository slugRepository) {
        // get slug from transformed string to lower case, remove spaces
        final String slug = string.replaceAll("\\s+", "-").toLowerCase();
        // same slug is already in database
        if (slugAlreadyExists(slug, slugRepository)) {
            // count postfixed slugs
            final Long countSimilarSlugs = slugRepository.countBySlugStartingWith(slug + "_");
            // try new slug postfix is dependent on count of previous slug postfix
            Long slugPostfix = countSimilarSlugs + 1;
            // if already exists
            while (slugAlreadyExists(getPostfixedSlug(slug, slugPostfix), slugRepository)) {
                // try increasing postfix until it is unique
                slugPostfix++;
            }
            return getPostfixedSlug(slug, slugPostfix);
        }
        return slug;
    }

    private static boolean slugAlreadyExists(String slug, SlugRepository slugRepository) {
        return slugRepository.countBySlug(slug) > 0;
    }

    private static String getPostfixedSlug(String slug, Long postfix) {
        return slug + "_" + postfix;
    }

}
